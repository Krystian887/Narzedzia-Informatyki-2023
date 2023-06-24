import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = scanner.nextLine();

        System.out.println("Witaj, " + name + "! Super ze jesteś");
    }
}