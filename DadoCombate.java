
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
        faces = new Lado[] {Lado.ESCUDO_MONSTRO, Lado.ESCUDO_HEROI, Lado.ESCUDO_HEROI, Lado.CAVEIRA, Lado.CAVEIRA, Lado.CAVEIRA};
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
