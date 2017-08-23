public class Calentador
{
    //variables de instancia
    private int temperatura;
    private int incremento;
    private int max;
    private int min;
    //Constructor
    public Calentador()
    {
        temperatura=15;
        incremento=3;
        min=-6;
        max=21;
    }
    //Metodos
    public void calentar()
    {
        if(temperatura<max)
        {
            temperatura=temperatura+incremento;
        }
    }
    
    public void enfriar()
    {
        if(temperatura>min)
        {
            temperatura=temperatura-incremento;
        }
    }
    
   public String consultaTemp()
   {
       String cadResultado="";
       cadResultado=cadResultado+temperatura;
       cadResultado=cadResultado+"°";
       return cadResultado;
   }
}