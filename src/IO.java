import java.util.Scanner;

public class IO {
    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        String menuModel = createMenuModel();
        System.out.println(menuModel);
        System.out.println("Bem vindo ao New tiger:");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número valido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static String createMenuModel() {
        StringBuilder model = new StringBuilder();
        model.append("--------------------------------\n");
        model.append("1 - EASY\n");
        model.append("2 - MEDIUM\n");
        model.append("3 - HARD\n");
        model.append("0 - Sair\n");
        model.append("--------------------------------");
        return model.toString();
    }

    public static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}