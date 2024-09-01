package factoryPattern;

public class Dog implements Pet{
    private String type;

    public Canine(String type) {
        this.type = type;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    public void performActivity() {
        System.out.println("The canine is fetching a stick.");
    }

    public String getType() {
        return type;
    }
}
