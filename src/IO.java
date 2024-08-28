import java.util.Scanner;

public class IO {
    private static final Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("1 - Modo Fácil");
        System.out.println("2 - Modo Médio");
        System.out.println("3 - Modo Difícil");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
