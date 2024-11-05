package Midia;

public class Filme implements Midia{
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirFilme(this);
    }

    private String nome;
    private String genero;
    private String publicadora;

    public Filme(String genero, String publicadora, String nome) {
        this.genero = genero;
        this.publicadora = publicadora;
        this.nome = nome;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(String publicadora) {
        this.publicadora = publicadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
