
public class Punto
{
    private Integer x;
    private Integer y;
    private Integer z;
    private String tipo;



    public Punto()
    {

    }

    public Punto(Integer x, Integer y)
    {
        this.x=x;
        this.y=y;
        this.tipo="NOTIPO";
        this.z=1000000000;
    }

    public Punto(Integer x, Integer y, Integer z, String tipo) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.tipo = tipo;
    }


    public void mostrar()
    {
        System.out.println(x);
        System.out.println(y);
        if (z!=1000000000)
        {
            System.out.println(z);
        }
        if(!tipo.equalsIgnoreCase("NOTIPO"))
        {
            System.out.println(-1);
        }

    }
}
