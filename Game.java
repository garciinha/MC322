
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
        Scanner keyboard = new Scanner ( System.in ) ;
        boolean acaoDisponivel = true;
        boolean podeAndar = true;
        boolean  jogadorNaoDesistiu = true;
        while (jogadorNaoDesistiu && (acaoDisponivel || podeAndar) ) {
            System.out.print(" Digite a direcao que deseja andar (wasd), acao (acao) ou desistir(caso queira passar para a proxima rodada) (pass) : ") ;
            String command = keyboard.nextLine() ;
            if ( command.compareTo ("pass") == 0) {
                jogadorNaoDesistiu = false ;
            } else if ( command.compareTo ("w") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command.compareTo ("a") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command.compareTo ("s") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command.compareTo ("d") == 0) {
                //funcao de andar
                //verifica se ainda pode andar, caso nao modifica o podeAndar parar false;
            } else if ( command.compareTo ("acao") == 0) {
                if(!acaoDisponivel) {
                    System.out.println("Voce nao pode realizar uma acao agora.");
                else {
                System.out.println("Escolha uma acao entre : atacar (a), usar magia (s), tomar pocao (q), procurar (f)");
                acaoDisponivel = false;
                if (command.compareTo ("a") == 0) {
                //chama a funcao de ataque 
                } 
                else if ( command.compareTo ("s") == 0) {
                    //chama a funcao de usar magia
                } 
                else if ( command.compareTo ("q") == 0) {
                    //chama a funcao da pocao de cura 
                } 
                else if ( command.compareTo ("f") == 0) {
                    // chama a funcao de olhar armadilhas no mapa
                } 
        }
    }

}
