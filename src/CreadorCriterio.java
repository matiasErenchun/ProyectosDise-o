import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

public class CreadorCriterio
{
    public Criterio crearTipoCriterio(String nombre)
    {
        switch ( nombre )
        {
            case "AnguloDiedro":
                return new AnguloDiedro();
            case "AnguloDiedroMaximo":
                return new AnguloDiedroMaximo();
            case "AnguloDiedroMinimo":
                return new AnguloDiedroMinimo();
            case "AnguloMaximo":
                return new AnguloMaximo();
            case "AnguloMinimo":
                return new AnguloMinimo();
            case "RazonVolumenLado":
                return new RazonVolumenLado();
            case "RazondeAspecto":
                return new RazondeAspecto();
            case "Volumen":
                return new Volumen();
            default:
                throw new IllegalArgumentException(" criterio no encontrado");
        }
    }

    public void mostrarcriterios(String nombre)
    {
        System.out.println();
    }
}
