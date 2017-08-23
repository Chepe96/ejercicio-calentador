public class Calentador
{
    private int temperatura;
    //Constructor
    public Calentador()
    {
        temperatura=15;
    }
    //Metodos
    public void calentar()
    {
        temperatura=temperatura+5;
    }
    
    public void enfriar()
    {
        temperatura=temperatura-5;
    }
    
    public void consultaTemperatura()
    {
        System. out. println("\nLa temperatura ahora: "+temperatura+"°");
    }
}