import java.io.*;
/**
 *
 * @author Luis Gregorio
 */
public class Cargar extends Comandos {

    private AlmacenaFigura almacenfiguras;
    private String nombrearchivo;

    private boolean invariante(){
        return almacenfiguras!=null;
    }

    public Cargar(String nombre) {
        assert nombre!=null:"Error Constructor Cargar";
        this.nombrearchivo = nombre;
    }
    public void ejecutar() {

        String cabeceratipo;
        File archivos = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivos = new File("/Users/lsilvest/Documents/Eclipse Standar Luna/workspace/ProyectoDis_1_2019/src/" + nombrearchivo);
            fr = new FileReader(archivos);
            br = new BufferedReader(fr);

            cabeceratipo = br.readLine();

            //Diferenciando entre distintos formatos 2D|3D y GRD
            //formatoA y B retornan en parser solo vecto de figuras
            //se requiere retornar el contador de Figuras del vector
            CreadorFormato C = new CreadorFormato();
            Formato F;
            System.out.println("cabecera--> " + cabeceratipo);
            F = C.creadorFormato(cabeceratipo);
            this.almacenfiguras = F.parser(cabeceratipo, br);

            assert this.invariante(): "Error de Invariante Cargar";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public AlmacenaFigura getFiguras() {
        return almacenfiguras;
    }
}