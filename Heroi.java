
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
    private List<Item> mochila=new ArrayList<Item>();
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
            if(dado.jogar() == Lado.CAVEIRA)
                ataque++;
        }
        Monstro.defender(ataque);
    }

    /**
     *
     */
    public void defender(int ataque) {
      DadoCombate dado = new DadoCombate();
      int defesa = 0;
      for(int i = 0; i < this.bonusDefesa; i++) {
          if(dado.jogar() == Lado.ESCUDO_HEROI)
              defesa++;
      }
      int resultado = ataque - defesa;
      if(resultado > 0) {
        this.vida -= resultado;
      }
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
        String conteudo="O conteudo da mochila é:";
        for(Item item: mochila)
            conteudo+=" "+item.getInformation()
        System.out.println(conteudo);
    }

    /**
     *
     */
    public void mover(direcao: char)() {
        // TODO implement here
    }

}
