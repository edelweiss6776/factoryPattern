package factoryPattern;

public class Cat implements Pet{
    private int livesLeft;

    public Feline(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    @Override
    public void makeNoise() {
        System.out.println("Purr! Purr!");
    }

    @Override
    public void performActivity() {
        System.out.println("The feline is chasing a laser pointer.");
    }

    public int getLivesLeft() {
        return livesLeft;
    }
}
}
