package src.Principal;

import src.Personaje.Bestias.*;
import src.Personaje.Heroes.*;

public class juego {
    Heroe[] hero = { new Elfo("Caranthir"), new Elfo("Celeborn."), new Elfo("Curufin"), new Elfo("Legolas"),
            new Hobbit("Bilbo"), new Hobbit("frodo"), new Hobbit("samsagaz"), 
            new Humano("Aragorn"), new Humano("Theoden"), new Humano("Boromir") };
    Bestias[] bestia = { new Orco("Bruzgaf "), new Orco("Gorged"), new Orco("Augdu"), new Orco("Augzush"),
            new Orco("Uthru"), new Trasgo("Dabu"), new Trasgo("Lak´tuk"), new Trasgo("Lo'Gosh"), new Trasgo("Lok'tar"),
            new Trasgo("Swobu") };

    public static void main(String[] args) {
        juego e = new juego();
    }

    public juego() {
        this.pelea();

    }

    public void pelea() {
        System.out.println("los ejercitos son");
        System.out.println("Bestias");
        mostrar(bestia);
        System.out.println("Heroes");
        mostrar(hero);
        duelo();
        mostrar(hero);
    }

    public void duelo() {

        for (int i = 0; i < bestia.length; i++) {
            Heroe he = hero[i];
            Bestias ha = bestia[i];
            System.out.println("turno "+(i+1));  
                this.CondicionPelea(he, ha);
                Randoms.Ataque(90);
                hero[i].recibirAtaque(ha);
                bestia[i].recibirAtaque(he);
            if (bestia == null) {
                System.out.println("las bestias han perdidos");
            } else if (hero == null){
                System.out.println("Los heroes han perdido");
            } 
        }
        

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

    public void mostrar(Object[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }
    }

}
