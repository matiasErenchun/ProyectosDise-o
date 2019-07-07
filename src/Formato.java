
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public abstract class Formato extends AlmacenaFigura {

    /**
     * Default constructor
     */
    public Formato() {
    }



    /**
     * @param cabecera 
     * @param br 
     * @return
     */
    public abstract AlmacenaFigura parser(String cabecera, BufferedReader br) throws IOException;

    /**
     * 
     */
    public void AlmacenaFigura() {
        // TODO implement here
    }

    /**
     * @param cabecera 
     * @param cont 
     * @param vecfig
     */
    public void AlmacenaFigura(String cabecera, int cont, Figura vecfig) {
        // TODO implement here
    }

    /**
     * 
     */
    public void mostrar() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getNombreAlmacena() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getNumeroAlmacena() {
        // TODO implement here
        return 0;
    }

    /**
     * @param i 
     * @return
     */
    public Figura getInforFigura(int i) {
        // TODO implement here
        return null;
    }

}