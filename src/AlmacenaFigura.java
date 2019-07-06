/**
 *
 * @author Luis Gregorio
 */

public class AlmacenaFigura {
    private Figura figuraalmacena[];
    private int contadorfiguras;
    private String tipofigura;
    public  AlmacenaFigura() {

    }
    public  AlmacenaFigura(String cabecera,int cont,Figura vecfig[]) {
        this.figuraalmacena=vecfig;
        this.contadorfiguras=cont;
        this.tipofigura=cabecera;

    }
    public void mostrar(){
        System.out.println("tipofigura "+tipofigura);
        System.out.println("contfigura "+contadorfiguras);
        for(int i=0;i<contadorfiguras;i++)
            figuraalmacena[i].mostrar();
    }

    public String getNombreAlmacena(){
        return tipofigura;
    }
    public int getNumeroAlmacena(){
        return contadorfiguras;
    }
    public Figura getInforFigura(int i){
        return figuraalmacena[i].getFigura();
    }
}