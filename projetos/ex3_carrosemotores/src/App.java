

public class App {
    public static void main(String[] args) throws Exception {
         Motor m = new Motor(150, "Gasolina");
        Carro c = new Carro("Fiat", "Cronos", m);
        c.exibirDetalhes();
    }



}

