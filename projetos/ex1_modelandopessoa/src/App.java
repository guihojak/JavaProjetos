/*Modelando uma Pessoa
Implemente uma classe Pessoa que represente uma pessoa com os atributos nome (String) e idade (int). A
classe deve ter um construtor que inicializa esses dados. Adicionalmente, crie um método fazerAniversario
que aumenta a idade da pessoa em 1, e um método exibirIdade que imprime no console a idade atual. Para
testar, crie um objeto Pessoa no seu método main, exiba sua idade, chame o método fazerAniversario e exiba
a idade novamente para confirmar a alteração.*/

package projetos.ex1_modelandopessoa.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite a seu nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        pessoa.idade = scanner.nextInt();
        pessoa.fazerAniversario();
        pessoa.exibirIdade();

        scanner.close();
    }
}
