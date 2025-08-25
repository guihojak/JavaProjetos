/*Modelando uma Pessoa
Implemente uma classe Pessoa que represente uma pessoa com os atributos nome (String) e idade (int). A
classe deve ter um construtor que inicializa esses dados. Adicionalmente, crie um método fazerAniversario
que aumenta a idade da pessoa em 1, e um método exibirIdade que imprime no console a idade atual. Para
testar, crie um objeto Pessoa no seu método main, exiba sua idade, chame o método fazerAniversario e exiba
a idade novamente para confirmar a alteração.*/
package projetos.modelandopessoa.src;

public class Pessoa {
    public String nome;
    public int idade;

    public void fazerAniversario(){
        this.idade++;
    }

    public void exibirIdade(){   
        System.out.println( "Parabens " + this.nome + ", voce fez "+this.idade+ " anos!");
    } 

}
