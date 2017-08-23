public class Calentador
{
    //variables de instancia
    private int temperatura;
    private int incremento;
    //Constructor
    public Calentador()
    {
        temperatura=15;
        incremento=3;
    }
    //Metodos
    public void calentar()
    {
        if(temperatura<=27)
        {
            temperatura=temperatura+incremento;
        }
    }
    
    public void enfriar()
    {
        if(temperatura>=-7)
        {
            temperatura=temperatura-incremento;
        }
    }
    
    public void consultaTemperatura()
    {
        System. out. println("\nLa temperatura ahora: "+temperatura+"°");
    }
}