package src.Personaje.Heroes;

import src.Personaje.Personaje;

public class Heroe extends Personaje{

    protected static int maximoAtaque = 100, CANTIDAD_DADOS = 2;
    protected static int cantidadInstancias = 0;

    public Heroe(String nombre, int vida) {
        super(nombre, vida, Heroe.maximoAtaque);
        Heroe.cantidadInstancias++;
    }

    public static int getMaximoAtaque() {
        return maximoAtaque;
    }

    public static void setMaximoAtaque(int maximoAtaque) {
        Heroe.maximoAtaque = maximoAtaque;
    }

    public static int getCANTIDAD_DADOS() {
        return CANTIDAD_DADOS;
    }

    public static void setCANTIDAD_DADOS(int cANTIDAD_DADOS) {
        CANTIDAD_DADOS = cANTIDAD_DADOS;
    }

    public static int getCantidadInstancias() {
        return cantidadInstancias;
    }

    public static void setCantidadInstancias(int cantidadInstancias) {
        Heroe.cantidadInstancias = cantidadInstancias;
    }


    
    
    
}
