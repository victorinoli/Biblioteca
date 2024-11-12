public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void locaLivro() {
        if(disponivel) {
            disponivel = false;
            System.out.printf("Livro %s locado com sucesso!\n", titulo);
        }else {
            System.out.printf("Livro %s nao esta disponivel!\n", titulo);
        }
    }

    public void devolveLivro() {
        if(!disponivel) {
            disponivel = true;
            System.out.printf("Livro %s devolvido com sucesso!\n", titulo);
        }else{
            System.out.printf("Livro %s nao esta locado!\n", titulo);
        }
    }

}
