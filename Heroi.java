
import java.util.*;

/**
 * 
 */
public abstract class Heroi extends Elemento implements ElementoMovel {

    /**
     * Default constructor
     */
    public Heroi() {
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private int dadosAtaque;

    /**
     * 
     */
    private int dadosDefesa;

    /**
     * 
     */
    private int vida;

    /**
     * 
     */
    private int inteligencia;

    /**
     * 
     */
    private Set<Item> mochila;

    /**
     * 
     */
    private Arma ArmasAtuais;

    /**
     * 
     */
    private int bonusAtaque;

    /**
     * 
     */
    private int bonusDefesa;

    /**
     * 
     */
    private int bonusMovimento;

    /**
     * 
     */
    public Ponto posicao;

    /**
     * 
     */
    public void jogarDadosAndar() {
        // TODO implement here
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