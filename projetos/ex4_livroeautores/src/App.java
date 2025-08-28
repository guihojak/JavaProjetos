

public class App {
    public static void main(String[] args) {
        Autor a = new Autor("Machado de Assis", "Brasileiro");

        Livro l1 = new Livro("Dom Casmurro", a);
        Livro l2 = new Livro("Memórias Póstumas", a);

        l1.exibirInfo();
        l2.exibirInfo();
    }
}
