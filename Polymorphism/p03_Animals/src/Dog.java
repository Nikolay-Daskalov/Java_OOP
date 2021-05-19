public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    private final String sound = "DJAAF";

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s", this.getName(), this.getFavouriteFood()) +
                System.lineSeparator() + sound;
    }
}
