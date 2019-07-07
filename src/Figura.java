/**
 *
 * @author Luis Gregorio
 */
public class Figura {

    private String nombre;
    private int numPuntos = 0;
    private String tipo;
    private Punto puntos[] = new Punto[20];

    public boolean invariante(){
        return puntos!=null&&numPuntos!=0;
    }

    public void setPuntosVector(Iterador lista) {
        assert lista!=null:"Error de Contrato Figura";
        int i = 0;
        for (lista.first(); lista.isDone(); lista.next()) {
            puntos[i] = (Punto) lista.currentItem();
            i++;
        }
        this.numPuntos = i;
        assert this.invariante():"Error de Invariante";
    }

    public Figura getFigura() {
        return this;

    }

    public String getnombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Nombre --> " + nombre);
        for (int i = 0; i < numPuntos - 1; i++) {
            puntos[i].mostrar();
        }
        assert this.invariante():"Error de Invariante";
    }

    public void setNombreFigura(String nombrefig) {
        assert nombrefig!=null:"Error de Contrato SetNomFig Figura";
        this.nombre = nombrefig;
    }

    public void setTipoFigura(String tipo) {
        assert tipo!=null:"Error de Contrato SetNomFig Figura";
        this.tipo = tipo;
    }

    public String getTipoFigura() {;
        return tipo;
    }
}