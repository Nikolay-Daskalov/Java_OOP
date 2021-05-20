import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflection = Reflection.class;
        System.out.println(reflection.toString());
        Class<? super Reflection> superclass = reflection.getSuperclass();
        System.out.println(superclass.toString());
        Class<?>[] interfaces = reflection.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.toString());
        }
        Reflection reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject.toString());
    }
}
