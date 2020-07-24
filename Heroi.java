
import java.util.*;

/**
 *
 */
public abstract class Heroi extends ElementoCombate{
    protected String nome;
    protected int movimento;
    protected List<Item> mochila=new ArrayList<Item>();
    protected Arma ArmasAtuais;
    protected int bonusAtaque;
    protected int bonusDefesa;
    protected int bonusMovimento;

    protected Heroi(String nome) {
        this.nome = nome;
        this.movimento = 0;
    }

    int getInteligencia() {
      return this.inteligencia;
    }

    protected int jogarDadosAndar() {
        DadoVermelho dado = new DadoVermelho();
        movimento += dado.jogar();
        movimento += dado.jogar();
        return this.movimento;
    }

    protected void jogarDadosAtaque() {
        // TODO implement here
    }

    protected void movimentar() {
        // TODO implement here
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
