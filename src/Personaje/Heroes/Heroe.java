package src.Heroes;

import src.Personaje.Personaje;

public class Heroe extends Personaje{

    protected static int maximoAtaque;
    protected static int cantidadInstancias = 0;

    public Heroe(String nombre, int vida, int armadura, int maximoAtaque) {
        super(nombre, vida, armadura);
        this.maximoAtaque = maximoAtaque;
        Heroe.cantidadInstancias++;
    }

    
    
}
