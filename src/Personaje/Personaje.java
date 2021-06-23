package src.Personaje;

public class Personaje{
    
    protected String nombre;
    protected int vida, Armadura;

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



    
 

}