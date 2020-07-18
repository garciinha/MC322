
import java.util.*;

/**
 * 
 */
public class DadoCombate extends Dado {
    
    private Lado[] faces;
    /** 
     * Default constructor
     */
    public DadoCombate() {
        faces = new Lado[] {ESCUDO_MONSTRO, ESCUDO_HEROI, ESCUDO_HEROI, CAVEIRA, CAVEIRA, CAVEIRA};
    }




    /**
     * 
     */
    public Lado jogar() {
        Random resultado = new Random[];
        return faces[resultado.nextInt(6) + 1]; 
        // TODO implement here
    }

}
