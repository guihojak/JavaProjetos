
public class Livro {
    String titulo;
    Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor.nome + " (" + autor.nacionalidade + ")");
    }
}
