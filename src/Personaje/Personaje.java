package src.Personaje;

public class Personaje{
    
    protected String nombre;
    protected int vida, Armadura, ataque;

    public Personaje(){
    }

    public Personaje(String nombre, int vida,int ataque,int armadura ) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        Armadura = armadura; 
        
     
    }
    public int ObtenerArmadura(Personaje atacante){
        return this.getArmadura();
    }
    public int obtenerAtaque(Personaje defensor){
        return this.getAtaque();
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

    public void recibirAtaque(Personaje atacante){
        System.out.println(" " + atacante.getNombre() + " atacará a "+ this.getNombre());
        System.out.println(" "+ atacante.getArmadura()+ "   "+this.Armadura);

        int danyoRecibido = this.ObtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (danyoRecibido <= 0){
            this.vida -= danyoRecibido;
        }
        else{
            danyoRecibido = 0;
        }
        System.out.println(" "+atacante.getNombre()+  " ataco a  " + this.getNombre() + " hizo daño: " + danyoRecibido  + " le queda vida: "+this.getVida());
    }

    @Override
    public String toString() {
        return "Armadura=" + Armadura + ", ataque=" + ataque;
    }



    
 

}