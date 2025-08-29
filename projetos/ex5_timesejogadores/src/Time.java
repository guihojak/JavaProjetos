import java.util.ArrayList;
import java.util.List;

public class Time {
    String nome,cidade;
    List<Jogador> jogadoresTime;
    
    public Time(String nome , String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoresTime = new ArrayList<>();
    }

    public void addJogador(Jogador jogadores){
        jogadoresTime.add(jogadores);
    }

    public void listarJogadores(){
       System.out.println("Jogadores do "+nome+":");
        for(Jogador j : jogadoresTime)
             System.out.println(" - " + j);
    }
}