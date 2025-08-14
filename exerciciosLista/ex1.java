package exerciciosLista;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int x = scanner.nextInt();
        
        scanner.close();
        System.out.printf("Valor digitado: %d",x);
        
    }
}