/**
 *
 * @author Luis Gregorio
 */
public class ListaPuntos extends AbstractLista {

    private int dimension = 0;
    private Punto[] listapuntos = new Punto[20];

    private boolean invariante(){
        return listapuntos!=null;
    }

    public Iterador creadorIterador() {
        return new IteradorNormal(this);
    }

    public void add(int x, int y, int z, String tipop) {
        assert tipop!=null&&x>=0&&y>=0&&z>=0:"Error de Contrato ListPunt Add";
        listapuntos[dimension] = new Punto(x, y, z, tipop);
        dimension++;
        assert this.invariante():"Error de Invariante ListPunt Add";
    }

    public int dimension() {
        return dimension;
    }

    public Punto getPunto(int pos) {
        assert pos>=0:"Erro de COntrato getPunto";
        assert this.invariante():"Error de Invariante ListPunt GetPunt";
        return listapuntos[pos];
    }
}