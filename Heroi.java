
import java.util.*;

/**
 * 
 */
public abstract class Heroi extends Elemento implements ElementoMovel {   
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
    
    public Heroi(String nome) {
        this.nome = nome;
        this.movimento = 0;
        
    }

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
    public void atacar(Monstro inimigo) {
        DadoCombate dado = new DadoCombate();
        int ataque = 0;
        for(int i = 0; i < this.bonusAtaque; i++) {
            if(dado.jogar() == Lado.Caveira)
                ataque++;
        }
        Monstro.defender(ataque);
    }

    /**
     * 
     */
    public void defender(int ataque) {
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
