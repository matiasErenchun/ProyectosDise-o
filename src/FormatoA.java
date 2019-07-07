
import java.io.*;
import java.io.BufferedReader;
import java.util.StringTokenizer;

/**
 *
 * @author Luis Gregorio
 */
public class FormatoA extends Formato {

    private AlmacenaFigura almacenarfiguras = null;

    public boolean invariante(){
        return almacenarfiguras!=null;
    }

    public AlmacenaFigura parser(String cabecera, BufferedReader br) throws IOException {
        assert cabecera!=null&&br!=null:"Error de Contrato FormatoA";
        String linea, linea2;
        String tipofigura;
        StringTokenizer entrada, entrada2;
        int contadorfiguras = 0;
        Figura figura = null;
        Figura vecfiguras[] = new Figura[20];
        int x, y, z;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            entrada = new StringTokenizer(linea);
            while (entrada.hasMoreTokens()) {
                tipofigura = entrada.nextToken();
                linea2 = br.readLine();
                entrada2 = new StringTokenizer(linea2);
                AbstractLista lista = new ListaPuntos();

                while (entrada2.hasMoreTokens()) {
                    z = 0;
                    x = Integer.parseInt(entrada2.nextToken());
                    y = Integer.parseInt(entrada2.nextToken());
                    if (cabecera.equals("3D")) {
                        z = Integer.parseInt(entrada2.nextToken());
                    }
                    //System.out.println("Datos ingresandos ->x= " + x + " y= " + y);

                    lista.add(x, y, z, cabecera);
                }
                Iterador iteralista;
                iteralista = lista.creadorIterador();

                Creador creadorfigura = new CreadorConcreto();
                figura = creadorfigura.crearFigura(tipofigura, iteralista);
            }
            vecfiguras[contadorfiguras] = figura;
            contadorfiguras++;
        }

        almacenarfiguras = new AlmacenaFigura(cabecera, contadorfiguras, vecfiguras);
        assert this.invariante():"Error de Invariante FormatoA";
        return almacenarfiguras;
    }
}