import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Method[] declaredMethods = Reflection.class.getDeclaredMethods();
        Predicate<Method> predicate = method -> method.toString().contains("get");

        Set<Method> getters = Arrays.stream(declaredMethods)
                .filter(predicate)
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        predicate = method -> method.toString().contains("set");

        Set<Method> setters = Arrays.stream(declaredMethods)
                .filter(predicate)
                .sorted(Comparator.comparing(Method::getName))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (Method getter : getters) {
            System.out.printf("%s will return class %s",getter.getName(),getter.getReturnType().getName());
            System.out.println();
        }

        for (Method setter : setters) {
            System.out.printf("%s will set field of class %s",setter.getName(),setter.getParameterTypes()[0].getName());
            System.out.println();
        }
    }
}