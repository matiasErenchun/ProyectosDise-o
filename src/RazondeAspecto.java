/**
 *
 * @author Luis Gregorio
**/

import java.io.IOException;
import java.util.*;

public class RazondeAspecto extends Criterio2D
{

    private int razon;
    private float razonfin;
    private String formato;
    private String[] vecresultados;
    private String nombre = "Razon de Aspecto";
    private String archivo;
    private String respuesta;

    private boolean invariante()
    {
        return vecresultados != null;
    }

    public RazondeAspecto()
    {

    }

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
    public void ejecutar(AlmacenaFigura Almacen)
    {
        assert Almacen!=null:"Error de Contrato RazonAspecto";
        int numfiguras = 0;
        Figura figura;
        System.out.print("\nRazon para la clasificacion? ");
        razon = Integer.parseInt(readLn(255));
        System.out.print("\nDesea Guardar el Archivo? ");
        respuesta = readLn(255);
        System.out.print("\nFormato? ");
        formato = readLn(255);
        if (respuesta.equals("Si"))
        {
            System.out.print("\nNombre del archivo? ");
            archivo = readLn(255);
        }
        numfiguras = Almacen.getNumeroAlmacena();
        for (int i = 0; i < numfiguras; i++)
        {
            figura = Almacen.getInforFigura(i);
            System.out.println("Analizando figura-> " + figura.getnombre());
        }
        Random r = new Random();
        int valor = razon + r.nextInt(10);
        vecresultados = new String[5 * valor];
        int j = 0;
        for (int i = 0; i < valor; i++)
        {
            figura=Almacen.getInforFigura(r.nextInt(Almacen.getNumeroAlmacena()));
            vecresultados[j] = String.valueOf(r.nextInt(10));
            vecresultados[j + 1] = figura.getnombre()+"s";
            vecresultados[j + 2] = nombre;
            vecresultados[j + 3] = String.valueOf(i + 1);
            vecresultados[j + 4] = String.valueOf(((i + 1)) + 0.99);
            j = j + 5;
        }
        assert this.invariante():"Error de Invariante RazonAspecto";
    }

    public String[] getresultados()
    {
        return vecresultados;
    }

    public String getformato()
    {
        return formato;
    }

    public String getnombre()
    {
        return nombre;
    }

    public String getatributo()
    {
        return String.valueOf(razon);
    }

    public String getarchivo()
    {
        return archivo;
    }

    public String getrespuesta()
    {
        return respuesta;
    }
}