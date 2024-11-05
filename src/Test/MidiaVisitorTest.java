package Test;

import Midia.Filme;
import Midia.Jogo;
import Midia.Livro;
import Midia.MidiaVisitor;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class MidiaVisitorTest {


    @Test
    void deveExibirLivro(){
        Livro livro = new Livro("Floresta Sombria", "Ficção");
        MidiaVisitor mv = new MidiaVisitor();
        assertEquals("Jogo: Floresta Sombria\n" +
                "Genero: Ficção",mv.exibirLivro(livro));
    }

    @Test
    void deveExibirJogo(){
        Jogo jogo = new Jogo("TPS Shoter", "DeadLock", "PC");
        MidiaVisitor mv = new MidiaVisitor();
        assertEquals("Jogo: DeadLock\n" +
                "Genero: TPS Shoter\n" +
                "Plataforma: PC",mv.exibirJogo(jogo));
    }

    @Test
    void deveExibirFilme(){
        Filme filme = new Filme("Ação", "Universal Studios", "Velozes e Furiosos");
        MidiaVisitor mv = new MidiaVisitor();
        assertEquals("Filme: Velozes e Furiosos\n" +
                "Genero: Ação\n" +
                "Publicadora: Universal Studios",mv.exibirFilme(filme));
    }

}