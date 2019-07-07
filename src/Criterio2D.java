import java.util.Set;

public abstract class Criterio2D extends Criterio
{
    private Set<String> arraycriterio2d;
    private Criterio2D criterio2D;
    public Criterio2D()
    {

    }

    public void mostrarcriterios()
    {

    }

    public abstract void ejecutar(AlmacenaFigura al);

    public abstract String[] getresultados();

    public abstract String getformato();

    public abstract String getnombre();

    public abstract String getatributo();

    public abstract String getarchivo();

    public abstract String getrespuesta();

}
