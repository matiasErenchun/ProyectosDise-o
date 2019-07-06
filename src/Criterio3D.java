import java.util.Set;

public abstract class Criterio3D
{
    private Set<String> arraycriterio3d;
    private Criterio2D criterio2D;
    public Criterio3D()
    {

    }

    public void mostrarcriterios()
    {

    }


    public abstract void ejecutar(AlmacenaFigura al);

    public abstract String getresultados();

    public abstract String getformato();

    public abstract String getnombre();

    public abstract String getatributo();

    public abstract String getarchivo();

    public abstract String getrespuesta();
}

