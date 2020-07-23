
import java.util.*;
import java.util.Scanner;

public class Game {
    private boolean exitSelected;

    public Game() {
    }
    public void start() {
        exit = false;
        System.out.println("Game started!");
        while(!exit) {
            drawBoard();
            lerInput();
            updateBoard();
        }
        System.out.println("Game terminated. Bye!");
    }

    public void lerInput() {
        Scanner keyboard = new Scanner ( System . in ) ;
        boolean acaoDisponivel = true;
        boolean podeAndar =true;
        boolean  jogadorNaoDesistiu = true;
        while (jogadorNaoDesistiu && (acaoDisponivel || podeAndar) ) {
            System.out.print (" Digite a direcao que deseja andar, acao ou desistir (caso queira passar para a proxima rodada) : ") ;
            String command = keyboard . nextLine () ;
            if ( command . compareTo ("desistir") == 0) {
            jogadorNaoDesistiu = false ;
            } else if ( command . compareTo ("w") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command . compareTo ("a") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command . compareTo ("s") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command . compareTo ("d") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command . compareTo ("acao") == 0) {
                System.out.print (" Escolha uma acao entre : atacar, usar magia, tomar pocao cura, tomar pocao forca, procurar armadilhas");
                acaoDisponivel= false;
                if ( command . compareTo ("atacar") == 0) {
                //chama a funcao de ataque 
                } else if ( command . compareTo ("usar magia") == 0) {
                    //chama a funcao de usar magia
                } else if ( command . compareTo ("tomar pocao cura") == 0) {
                    //chama a funcao da pocao de cura 
                } else if ( command . compareTo ("tomar pocao forca") == 0) {
                    //chama a funcao da pocao da forca
                } else if ( command . compareTo ("procurar armadilhas") == 0) {
                    // chama a funcao de olhar armadilhas no mapa
                }else if ( command . compareTo ("procurar tesouros") == 0) {
                    // chama a funcao de procurar tesouros no mapa
                }
        }
    }

}
