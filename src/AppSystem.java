import java.util.ArrayList;
import java.util.List;

public class AppSystem {
    private List<Combinations> combinations;

    public AppSystem() {
        this.combinations = new ArrayList<>();
    }

    public void run() {
        boolean running = true;
        while (running) {
            int option = IO.menu();

            if (option == 1) {
                Combinations combination = createCombinations(3); // 3 sorteios
                combinations.add(combination);
                System.out.println(combination);
            } else if (option == 2) {
                Combinations combination = createCombinations(5); // 5 sorteios
                combinations.add(combination);
                System.out.println(combination);
            } else if (option == 3) {
                Combinations combination = createCombinations(7); // 7 sorteios
                combinations.add(combination);
                System.out.println(combination);
            } else if (option == 0) {
                running = false;
                System.out.println("Fim do jogo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private Combinations createCombinations(int numberOfDraws) {
        return new Combinations(numberOfDraws);
    }
}
