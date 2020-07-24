
import java.util.*;
import java.util.Scanner;

public class Game {
    private boolean exitSelected;

    public Game() {
    }
    public void start() {
        exit = false;
        System.out.println("Game started!");
        Scanner key = new Scanner(System.in);
        Heroi personagem;
        System.out.println("Qual será o nome do seu personagem?");
        String nome = key.nextLine();
        System.out.println("Qual será sua classe (Digite o número): 1. Anão, 2.Bárbaro, 3. Elfo, 4. Feiticeiro.");
        int class = key.nextInt();
        if(class == 1) personagem = new Anao(nome);
        else if(class == 2) personagem = new Barbaro(nome);
        else if(class == 3) personagem = new Elfo(nome);
        else if(class == 4) personagem = new Feiticeiro(nome);       
        while(!exit) {
            drawBoard();
            lerInput();
            updateBoard();
        }
        System.out.println("Game terminated. Bye!");
    }

    public void lerInput() {
        int movimento = personagem.jogarDadosAndar();
        System.out.println("Você pode andar " + movimento + " casas esse turno.");
        Scanner keyboard = new Scanner (System.in) ;
        boolean acaoDisponivel = true;
        boolean podeAndar = true;
        boolean  jogadorNaoDesistiu = true;
        while (jogadorNaoDesistiu && (acaoDisponivel || podeAndar) ) {
            System.out.println(" Digite um dos seguintes comandos: \"w-a-s-d\" caso queira andar, \"acao\" caso queira tomar alguma acao com seu personagem ou \"pass\" para passar para a proxima rodada.") ;
            String command = keyboard.nextLine() ;
            if (command.compareTo ("pass") == 0) {
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
