public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    private final String sound = "DJAAF";

    @Override
    public String explainSelf() {
        return super.explainSelf() + this.sound;
    }
}