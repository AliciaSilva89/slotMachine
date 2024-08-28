import java.util.Random;

public class Roulette {
    private static final Random RANDOM = new Random();
    private final Symbol symbol;

    public Roulette() {
        Symbol[] symbols = Symbol.values();
        this.symbol = symbols[RANDOM.nextInt(symbols.length)];
    }

    public Symbol getSymbol() {
        return symbol;
    }
}

