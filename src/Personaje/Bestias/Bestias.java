package src.Personaje.Bestias;

import src.Personaje.*;

public class Bestias extends Personaje{

    protected static int maximoAtaque = 90, CANTIDAD_DADOS = 1;
    protected static int cantidadInstancias = 0;

    public Bestias(String nombre, int vida, int armadura) {
        super(nombre, vida, Bestias.maximoAtaque, armadura);
        Bestias.cantidadInstancias++;
    }

    public static int getMaximoAtaque() {
        return maximoAtaque;
    }

    public static void setMaximoAtaque(int maximoAtaque) {
        Bestias.maximoAtaque = maximoAtaque;
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
        Bestias.cantidadInstancias = cantidadInstancias;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" vida ("+vida+") "+super.toString();
    }
    
}
