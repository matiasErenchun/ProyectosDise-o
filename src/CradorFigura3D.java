public class CradorFigura3D extends CreadorFigura
{

    @Override
    public Figura crearFigura(String tipo,Iterador lista)
    {
        Figura nFigura;
        if(tipo.equalsIgnoreCase("Piramide"))
        {
            nFigura=new Piramide(tipo, lista);
        }
        if(tipo.equalsIgnoreCase("Hexaedro"))
        {
            nFigura=new Hexaedro(tipo,lista);
        }
        if(tipo.equalsIgnoreCase("Tetraedro"))
        {
            nFigura=new Tetraedro(tipo, lista);
        }
        else
        {
            nFigura=new Figura();
        }

        return nFigura;
    }
}

