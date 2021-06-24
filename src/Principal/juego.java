package src.Principal;



import java.beans.beancontext.BeanContext;

import src.Personaje.Personaje;
import src.Personaje.Bestias.*;
import src.Personaje.Heroes.*;

public class juego {
    Heroe[] hero = { new Elfo("Caranthir"), new Elfo("Celeborn."), new Elfo("Curufin"), new Elfo("Legolas"),
            new Hobbit("Bilbo"), new Hobbit("frodo"), new Hobbit("samsagaz"), new Humano("Aragorn"),
            new Humano("Theoden"), new Humano("Boromir") };
    Bestias[] bestia = { new Orco("Bruzgaf "), new Orco("Gorged"), new Orco("Augdu"), new Orco("Augzush"),
            new Orco("Uthru"), new Trasgo("Dabu"), new Trasgo("Lak´tuk"), new Trasgo("Lo'Gosh"), new Trasgo("Lok'tar"),
            new Trasgo("Swobu") };

    private Personaje pers = new Personaje();

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

    }

    public void duelo() {
        int i = 0;
        do {
            
            System.out.println("\nturno " + (i + 1));
            this.CondicionPelea(hero[i], bestia[i]);
            hero[i].setAtaque(Randoms.Ataque(100));
            bestia[i].setAtaque(Randoms.Ataque(90));
            hero[i].recibirAtaque(bestia[i]);
            bestia[i].recibirAtaque(hero[i]);
            ajustarCasilla(hero, bestia);

            if (i < hero.length) {
                i=i+1;
            }else if (i < bestia.length) {
                i=i+1;
            }
            if (i == hero.length) {
                i=0;
                
            }else if(i == bestia.length){
                i=0;
            }
            ajustarCasilla(hero, bestia);
        } while (hero[0].getVida() > 0 && bestia[0].getVida() > 0);

        
        System.out.println("\nLOS GANADORES SON: ");
        if (hero[0].getVida() > 0) {
            System.out.println("\n     HEROES\n");
        } else {
            System.out.println("\n     BESTIAS\n");
        }

    }

    public boolean vivo() {

        if (pers.getVida() > 0) {
            return true;
        } else
            return false;
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

    public void ajustarCasilla(Heroe[] hero, Bestias[] beas) {
        for (int i = 0; i < beas.length; i++) {
            for (int j = 0; j < beas.length-1; j++) {
                if (hero[j].getVida() <= 0) {
                    Heroe aux = hero[j];
                    hero[j] = hero[j + 1];
                    hero[j + 1] = aux;
                }
                if (beas[j].getVida() <= 0) {
                    Bestias aux = beas[j];
                    beas[j] = beas[j + 1];
                    beas[j + 1] = aux;
                
                }
            }

        }

    }

}
