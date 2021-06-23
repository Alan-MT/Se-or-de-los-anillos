package src.Principal;

import src.Personaje.Bestias.*;
import src.Personaje.Heroes.*;

public class juego {

    public void pelea() {
        armaduraTodos();
    }

    public void armaduraTodos() {

    }

    public void inicarNombre() {

    }

    public void CondicionPelea(Heroe hero, Bestias bestia) {
        if ((hero instanceof Elfo) && (bestia instanceof Orco)) {
            hero.setArmadura((int) (hero.getArmadura() * 10));
        }
        if (bestia instanceof Orco) {
            hero.setArmadura((int) (hero.getArmadura() * 0.9));
        }
        if ((hero instanceof Hobbit) && (bestia instanceof Trasgo)) {
            hero.setArmadura((int) (hero.getArmadura() - 5));
        }
    }

}
