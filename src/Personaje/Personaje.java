package src.Personaje;

public class Personaje{
    
    protected String nombre;
    protected int vida, Armadura;
    protected final int CANTIDAD_DADOS = 0;

    public Personaje(){
        
    }

    public Personaje(String nombre, int vida, int armadura) {
        this.nombre = nombre;
        this.vida = vida;
        Armadura = armadura;
 
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return Armadura;
    }

    public void setArmadura(int armadura) {
        Armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    
 

}