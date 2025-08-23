package exerciciosLista;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite o 1 valor a ser somado: ");
        soma += scanner.nextInt();
        System.out.println("Digite o 2 valor a ser somado: ");
        soma += scanner.nextInt();
        System.out.printf("Valor da soma: %d",soma);
        scanner.close();
    }
}
