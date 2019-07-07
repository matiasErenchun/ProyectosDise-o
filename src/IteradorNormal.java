public class IteradorNormal extends Iterador
{
    private ListaPuntos vector;
    private int posicion;
    public IteradorNormal(ListaPuntos listaPuntos)
    {
        this.vector=listaPuntos;
        this.posicion=0;
    }

    public  Punto first()
    {
        return this.vector.getPunto(0);
    }

    public  boolean isDone()
    {
        if(this.posicion<this.vector.getLargo())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public  void  next()
    {
        this.posicion++;
    }

    public Punto currentItem()
    {
        return this.vector.getPunto(this.posicion);
    }
}
