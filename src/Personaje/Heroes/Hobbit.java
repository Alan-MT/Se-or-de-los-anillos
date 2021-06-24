package src.Personaje.Heroes;

public class Hobbit extends Heroe{

    public Hobbit(String nombre) {
        super(nombre, 200,50);
        
    }

    @Override
    public String toString() {
        return "Hobbit "+nombre+" vida("+vida+") "+super.toString();
    }
 
    
}
