
package variaveis;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        
        String teste [] = new String[2];
        Scanner scanner = new Scanner(System.in);

        for(int x = 0 ; x < 2 ; x++ ){
        
            System.out.println(String.format("Digite o texto da %d variavel para concatenar uma Frase: ",x+1));
             teste [x] = scanner.nextLine();
        
    
        }
            scanner.close();
            System.out.println(teste[0]+" "+teste[1]);
    }
    
}
