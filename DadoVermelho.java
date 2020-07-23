
import java.util.*;

public class DadoVermelho extends Dado {

    public DadoVermelho() {
    }

    public int jogar() {
        // TODO implement here
        Random valor = new Random();
        return valor.nextInt(6) + 1;
    }

}
