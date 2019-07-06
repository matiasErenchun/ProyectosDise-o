public abstract class AbstractLista
{
    public  abstract Iterador creadorIterador();

    public abstract void add(int x, int y,int z,String tipo);

    public abstract int dimension();

    public abstract Punto getPunto(int pos);

}
