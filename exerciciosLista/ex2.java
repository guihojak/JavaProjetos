package exerciciosLista;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        x = scanner.nextLine();
        scanner.close();
        System.out.printf("%s seja bem vindo!",x);
    }
}
