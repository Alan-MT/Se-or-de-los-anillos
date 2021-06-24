package src.Principal;
public class Randoms {
    
    public static int armadura(int limInf, int limsupe){
    return (int)(Math.random()*(limsupe-limInf)+limInf);
    }
    public static int Ataque(int limsupe){
    return (int)(Math.random()*limsupe);
    }

}