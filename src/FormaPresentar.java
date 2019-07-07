public class FormaPresentar
{
    private String[] arrayformapresentar;

    public FormaPresentar crearformapresentar(String forma)
    {
        if(forma.equals("Tabla"))
        {
            return new PresentaTabla();
        }
        else
        {
            return new PresentaTexto();
        }
    }

    public void mostrarformapresentar()
    {

    }

    public void getresultado( AlgoritmoClasificador athis,String respuesta)
    {

    }
}
