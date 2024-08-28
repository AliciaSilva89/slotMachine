import java.util.*;

public class Combinations implements Calculation {
    private final List<Symbol> symbols;
    private final int totalPoints;

    public Combinations(int drawNumber) {
        symbols = new ArrayList<>();
        totalPoints = calculateTotalPoints(drawNumber);
    }

    private int calculateTotalPoints(int drawNumber) {
        int points = 0;

        for (int index = 0; index < drawNumber; index++) {
            Roulette roulette = new Roulette();
            Symbol symbol = roulette.getSymbol();
            symbols.add(symbol);
            points += symbol.getPoints();
        }

        //Caso sejam iguais
        if (equalSymbols()) {
            points += points * 100; // Bonus
        }

        return points;
    }

    private boolean equalSymbols()  {
        Symbol initial = symbols.get(0);

        for (Symbol symbol : symbols) {
            if (symbol != initial) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int sunTotal() {
        return totalPoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol symbol : symbols) {
            sb.append(symbol.getLowerCaseName()).append(" ");
        }
        return "Sequencia: " + "|" + sb.toString().trim() +"|"+ " \nTotal Points: " + totalPoints;
    }
}

