public class Calentador
{
    //variables de instancia
    private int temperatura;
    private int incremento;
    private int max;
    private int min;
    //Constructor
    /**
     * Se inicializan las variables temperatura, incremento, min y max con sus 
     * respectivos valores, todo esto dentro del constructor.
     */
    public Calentador()
    {
        temperatura=15;
        incremento=3;
        min=-6;
        max=21;
    }
    //Metodos
    /**
     * Incrementa la temperatura sin ser mayor a la variable max.
     */
    public void calentar()
    {
        if(temperatura<max)
        {
            temperatura=temperatura+incremento;
        }
    }
    
    /**
     * Decrementa el valor de temperatura restandole el incremento, y sin pasarse
     * de la variable min.
     */
    public void enfriar()
    {
        if(temperatura>min)
        {
            temperatura=temperatura-incremento;
        }
    }
    
   /**
    * Regresa el valor de la temperatura por medio de una cadena.
    */
   public String consultaTemp()
   {
       String cadResultado="";
       cadResultado=cadResultado+temperatura;
       cadResultado=cadResultado+"°";
       return cadResultado;
   }
}