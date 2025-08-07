package variaveis;
import java.util.Scanner;


public class variavies {
    public static void main(String[] args) {     
    
    int [] vetor = new int[2];
    int soma = 0;

        Scanner scanner = new Scanner(System.in);

        for(int x = 0 ; x < 2 ; x++){
            System.out.println(String.format("Digite o %d valor inteiro: ", x+1));
            vetor [x]= scanner.nextInt();
            soma += vetor[x];
        }
        System.out.println(String.format("Resultado da Soma = %d",soma));
        scanner.close();
  } 
}
