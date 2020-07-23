
import java.util.*;

/**
 *
 */
public abstract class Heroi extends Elemento implements Combativel {
    protected String nome;
    protected int dadosAtaque;
    protected int dadosDefesa;
    protected int movimento;
    protected int vida;
    protected int inteligencia;
    protected List<Item> mochila=new ArrayList<Item>();
    protected Arma ArmasAtuais;
    protected int bonusAtaque;
    protected int bonusDefesa;
    protected int bonusMovimento;
    protected Ponto posicao;

    protected Heroi(String nome) {
        this.nome = nome;
        this.movimento = 0;
    }

    int getInteligencia() {
      return this.inteligencia;
    }

    protected void jogarDadosAndar() {
        DadoVermelho dado = new DadoVermelho();
        movimento += dado.jogar();
        movimento += dado.jogar();
    }

    protected void jogarDadosAtaque() {
        // TODO implement here
    }

    protectedvoid movimentar() {
        // TODO implement here
    }
    @Override
    protected void atacar(Monstro inimigo) {
        DadoCombate dado = new DadoCombate();
        int ataque = 0;
        for(int i = 0; i < this.bonusAtaque; i++) {
            if(dado.jogar() == Lado.CAVEIRA)
                ataque++;
        }
        Monstro.defender(ataque);
    }
    @Override
    protected void defender(int ataque) {
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

    @Override
    protected void defesaMagica(int ataque) {
      DadoCombate dado = new DadoCombate();
      int defesa = 0;
      for(int i = 0; i < this.inteligencia; i++) {
          if(dado.jogar() == Lado.ESCUDO_HEROI)
              defesa++;
      }
      int resultado = ataque - defesa;
      if(resultado > 0) {
        this.vida -= resultado;
      }
    }

    protected void vasculhar() {
        // TODO implement here
    }

    protected void verMochila() {
        String conteudo="O conteudo da mochila é:";
        for(Item item : mochila)
            conteudo+=" "+item.getInformation()
        System.out.println(conteudo);
    }

    protected void mover(direcao: char)() {
        // TODO implement here
    }

}
