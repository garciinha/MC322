
import java.util.*;

/**
 * 
 */
public abstract class Heroi extends Elemento implements ElementoMovel {

    /**
     * Default constructor
     */
    public Heroi(String nome) {
        this.nome = nome;
        this.movimento = 0;
        
    }
    
    private String nome;
    private int dadosAtaque;
    private int dadosDefesa;
    private int movimento;
    private int vida;
    private int inteligencia;
    private Item mochila;
    private Arma ArmasAtuais;
    private int bonusAtaque;
    private int bonusDefesa;
    private int bonusMovimento;


    private Ponto posicao;

    public void jogarDadosAndar() {
        
        DadoVermelho dado = new DadoVermelho();
        movimento += dado.jogar();
        movimento += dado.jogar();
        
    }

    /**
     * 
     */
    public void jogarDadosAtaque() {
        // TODO implement here
    }

    /**
     * 
     */
    public void movimentar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void atacar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void defender() {
        // TODO implement here
    }

    /**
     * 
     */
    public void vasculhar() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verMochila() {
        // TODO implement here
    }

    /**
     * 
     */
    public void mover(direcao: char)() {
        // TODO implement here
    }

}
