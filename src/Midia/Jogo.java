package Midia;

public class Jogo implements Midia {
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirJogo(this);
    }

    private String nome;
    private String genero;
    private String plataforma;

    public Jogo(String genero, String nome, String plataforma) {
        this.genero = genero;
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
