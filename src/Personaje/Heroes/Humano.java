package src.Personaje.Heroes;

public class Humano extends Heroe{

    public Humano(String nombre) {
        super(nombre, 180,65);
    }

    @Override
    public String toString() {
        return "Humano "+nombre+" vida("+vida+") "+super.toString();
    }
    

}