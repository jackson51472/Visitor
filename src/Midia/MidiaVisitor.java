package Midia;

public class MidiaVisitor implements Visitor{
    @Override
    public String exibirFilme(Filme filme) {
        return "Filme: " + filme.getNome()+
                "\nGenero: " + filme.getGenero() +
                "\nPublicadora: " + filme.getPublicadora();
    }

    @Override
    public String exibirJogo(Jogo jogo) {
        return "Jogo: " + jogo.getNome()+
                "\nGenero: " + jogo.getGenero() +
                "\nPlataforma: " + jogo.getPlataforma();
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Jogo: " + livro.getNome()+
                "\nGenero: " + livro.getGenero();
    }
}
