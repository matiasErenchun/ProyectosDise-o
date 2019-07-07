public class CreadorFigura2D extends CreadorFigura
{

    @Override
    public Figura crearFigura(String tipo, Iterador lista)
    {
        Figura nFigura;
        if(tipo.equalsIgnoreCase("Triangulo"))
        {
            nFigura=new Triangulo(tipo,lista);
        }
        if(tipo.equalsIgnoreCase("Cuadrado"))
        {
            nFigura=new Cuadrado(tipo,lista);
        }
        if (tipo.equalsIgnoreCase("Cuadrilatero"))
        {
            nFigura=new Cuadrilatero(tipo,lista);
        }
        else
        {
            nFigura=new Figura();
        }

        return nFigura;
    }
}
