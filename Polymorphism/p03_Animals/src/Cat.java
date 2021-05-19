public class Cat extends Animal {
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    private final String sound = "MEEOW";

    @Override
    public String explainSelf() {
        return super.explainSelf() + this.sound;
    }
}