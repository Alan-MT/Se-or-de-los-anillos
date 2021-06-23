package src.Principal;

import src.Personaje.Heroes.*;
import src.Personaje.Bestias.*;

public class Randoms {
    
    public static int  armadura(int limInf, int limsupe){
    return (int)(Math.random()*(limsupe-limInf)+limInf);
    }
    public static int Ataque(int limsupe){
    return (int)(Math.random()*limsupe);
    }
}
class duelo{

    public duelo(Heroe[] hero, Bestias[] bestia){
        for (int i = 0; i < 2; i++) {
 
        }

    }
    public void CondicionPelea(Heroe hero, Bestias bestia){
        if ((hero instanceof Elfo)&&(bestia instanceof Orco)) {
            hero.setArmadura((int)(hero.getArmadura()*10));
        }if (bestia instanceof Orco) {
            hero.setArmadura((int)(hero.getArmadura()*0.9));
        } if((hero instanceof Hobbit)&&(bestia instanceof Trasgo)) {
            hero.setArmadura((int)(hero.getArmadura()-5));
    }
}