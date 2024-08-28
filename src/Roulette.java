import java.util.Random;

public class Roulette {
    private int value;

    public Roulette() {
        Random random = new Random();
        this.value = random.nextInt(3);
    }


    public int getValue() {
        return value;
    }
}
