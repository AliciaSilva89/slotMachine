import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSystem {
    private List<Combinations> combinations;
    private Scanner sc;

    public AppSystem() {
        this.combinations = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        int control = 0;
        while (control == 0) {
            int option = IO.menu();
            if (option == 1) {
                Combinations combination = createEasy(); // Modo fácil
                combinations.add(combination);
                System.out.println("TOTAL: " + combination.sunTotal());
            } else if (option == 0) {
                control = 1;
                System.out.println("Fim do jogo!");
            } else {
                System.out.println("Erro! Tente novamente");
            }
        }
        sc.close();
    }

    private Combinations createEasy() {
        System.out.println("Roletando...");
        Roulette roleta1 = new Roulette();
        Roulette roleta2 = new Roulette();
        Roulette roleta3 = new Roulette();

        return new Combinations(roleta1.getValue(), roleta2.getValue(), roleta3.getValue());
    }
}
