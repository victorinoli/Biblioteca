//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("senhor dos aneis", "eu", "1982");

        boolean disponivel = livro.isDisponivel();

        System.out.println(disponivel);

        livro.locaLivro();
        livro.locaLivro();
        livro.devolveLivro();
        livro.devolveLivro();

    }
}