/**
 *
 * @author Luis Gregorio
 */
public class CreadorFormato {

    public Formato creadorFormato(String tipo) {
        if ((tipo.equals("2D")) || (tipo.equals("3D"))) {
            return new FormatoA();

        } else {
            return new FormatoB();

        }
    }
}