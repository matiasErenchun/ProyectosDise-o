/**
 *
 * @author Luis Gregorio
 */
public class AlgoritmoClasificador {

    private Criterio criterio;
    private AlmacenaFigura almacen;
    private String[] vecresultado;

    private  boolean invariante(){
        return criterio!=null && almacen!=null && vecresultado!=null;
    }

    AlgoritmoClasificador(AlmacenaFigura almacen, Criterio tipocriterio) {
        assert almacen!=null && tipocriterio!=null : "Error de Contrato Alg. Clasificador";
        this.almacen = almacen;
        this.criterio = tipocriterio;
        assert this.invariante(): "Error en Invariante Alg Class";
    }

    public void ejecutar() {

        criterio.ejecutar(almacen);
        vecresultado = criterio.getresultados();

        FormaPresentar presentar = new FormaPresentar();
        FormaPresentar presenta = presentar.crearformapresentar(criterio.getformato());
        presenta.getresultado(this, criterio.getrespuesta());
        assert this.invariante(): "Error en Invariante Alg Class";

    }

    public String nombrecriterio() {
        return criterio.getnombre();
    }

    public String nombrearchivo() {
        return criterio.getarchivo();
    }

    public String nombreatributo() {
        return criterio.getatributo();
    }
    public String getContResultado(int i) {
        assert i>=0: "Error contrato ContRes Alg. Clas.";
        return vecresultado[i];
    }

    public String getNombreFigura(int i) {
        assert i>=0: "Error contrato GetNomFig Alg. Clas.";
        return vecresultado[i];
    }

    public String getTipoCriterio(int i) {
        assert i>=0: "Error contrato GetTipCrit Alg. Clas.";
        return vecresultado[i];
    }

    public String getRangoini(int i) {
        assert i>=0: "Error contrato GetRanIni Alg. Clas.";
        return vecresultado[i];
    }

    public String getRangofin(int i) {
        assert i>=0: "Error contrato GetRanFin Alg. Clas.";
        return vecresultado[i];
    }

    public int getdimension() {
        return vecresultado.length;
    }

    public AlmacenaFigura getAlmacen() {
        return almacen;
    }

    public String getrespuesta() {
        return criterio.getrespuesta();
    }
}
