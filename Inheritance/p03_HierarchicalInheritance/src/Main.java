public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.eat();
        dog.bark();

        System.out.println("Cat:");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}