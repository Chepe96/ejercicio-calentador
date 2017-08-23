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