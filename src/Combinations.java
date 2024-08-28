public class Combinations implements Calculation {
    private int BANANA = 10;
    private int STRAWBERRY = 20;
    private int STAR = 40;

    public Combinations(int BANANA, int STRAWBERRY, int STAR) {
        this.BANANA = BANANA;
        this.STRAWBERRY = STRAWBERRY;
        this.STAR = STAR;
    }

    public int getBANANA() {
        return BANANA;
    }

    public int getSTRAWBERRY() {
        return STRAWBERRY;
    }

    public int getSTAR() {
        return STAR;
    }

    @Override
    public int sunTotal() {
        return BANANA + STRAWBERRY + STAR;
    }
}
