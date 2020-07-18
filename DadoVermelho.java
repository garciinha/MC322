
import java.util.*;

/**
 * 
 */
public class DadoVermelho extends Dado {

    /**
     * Default constructor
     */
    public DadoVermelho() {
    }

    /**
     * 
     */
    public void Attribute1;

    /**
     * 
     */
    public int jogar() {
        // TODO implement here
        Random valor = new Random();
        return valor.nextInt(6) + 1;
    }

}
