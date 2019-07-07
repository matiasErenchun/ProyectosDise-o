/**
 *
 * @author Luis Gregorio
**/
import java.io.IOException;

class Main
{
//LEE DATOS

    static String readLn(int ML)
    {
        byte linea[] = new byte[ML];
        int L = 0, car = -1;
        try
        {
            while (L < ML)
            {
                car = System.in.read();
                if (car < 0 || car == '\n')
                {
                    break;
                }
                linea[L++] += car;
            }
        } catch (IOException e)
        {
            return null;
        }
        if (car < 0 || L == 0)
        {
            return null;
        }
        return (new String(linea, 0, L));
    }

    static void begin()
    {
        String nombrearchivo, nomcriterio;
        System.out.println("Clasificador de Figuras 2D y 3D\n");
        System.out.print("Nombre de Archivo? ");

        while (!(nombrearchivo = readLn(255)).equals("Fin"))
        {
            Comando cargador = new Cargar(nombrearchivo);

            AlmacenaFigura almacen = ((Cargar) cargador).getAlmacenfiguras();
            almacen.mostrar();

            AbstractCriterio a = new CreadorCriterio();
            a.mostrarcriterios(almacen.getNombreAlmacena());

            FormaPresentar FP = new FormaPresentar();
            FP.mostrarformapresentar();

            System.out.print("\nSi desea Almacenar el resultado en un archivo debe ingresar su nombre");
            System.out.print("\nCriterio? ");
            while (!(nomcriterio = readLn(255)).equals("Fin"))
            {

                Criterio tipocriterio = a.creartipocriterio(nomcriterio);

                AlgoritmoClasificador algoritmoclasificador = new AlgoritmoClasificador(almacen, tipocriterio);
                algoritmoclasificador.ejecutar();
                System.out.print("\nCriterio? ");
            }
    System.out.print("Nombre de Archivo? ");
        }
    }
//ENCABEZADO PRINCIPAL

    public static void main(String[] args)
    {
     begin();
    }
}