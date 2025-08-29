public class Jogador {
    String nome,posicao;
    boolean inteam = false;
   

     public Jogador(String nome ,String posicao){
            this.nome = nome;
            this.posicao = posicao;
        }
    
    @Override
    public String toString(){
        return nome + "(" + posicao + ")";
    }

}
