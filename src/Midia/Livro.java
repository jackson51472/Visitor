package Midia;

public class Livro implements Midia {
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }

    private String nome;
    private String genero;

    public Livro(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}