/**
 *
 * @author Luis Gregorio
**/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Guardar extends Comando
{

    private AlgoritmoClasificador algoritmo;
    private String nombrearchivo;
    private String[] resultadoarray;

    private boolean invariante()
    {
        return algoritmo!=null&&resultadoarray!=null;
    }

    public Guardar(AlgoritmoClasificador algoritmo, String nombre, String[] result)
    {
        assert algoritmo!=null&&result!=null&&nombre!=null:"Error de Contrato Guardar";
        this.nombrearchivo = nombre;
        this.algoritmo = algoritmo;
        this.resultadoarray = result;
        assert this.invariante():"Errode Invariante Guardar";
    }
    public void ejecutar()
    {

        File archivos = null;
        FileWriter fr = null;
        BufferedWriter br = null;

        try
        {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivos = new File("e:\n" + nombrearchivo);
            fr = new FileWriter(archivos);
            br = new BufferedWriter(fr);
            br.write("Proceso de archivo " + nombrearchivo + "\n");
            br.write("Criterio " + algoritmo.nombrecriterio() + "\n");
            br.write(" " + algoritmo.nombreatributo() + "\n");
            for (int i = 0; i < resultadoarray.length; i++)
            {
                 br.write("\n" + resultadoarray[i] + "\n");
            }

            br.write("FIN");
             br.close();
            assert this.invariante():"Errode Invariante Guardar";
            //Diferenciando entre distintos formatos 2D|3D y GRD
            //formatoA y B retornan en parser solo vecto de figuras
             //se requiere retornar el contador de Figuras del vector


        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try
            {
                if (null != fr)
                {
                    fr.close();
                }
            } catch (Exception e2)
            {
                e2.printStackTrace();
            }
        }
    }

    public AlmacenaFigura getFiguras()
    {
        assert this.invariante():"Errode Invariante Guardar";
        return algoritmo.getAlmacen();
    }
}