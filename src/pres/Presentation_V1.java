package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation_V1 {
    public static void main(String[] args) {
       /*
        Injection des dépendances par instanciation statique
        */
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(d);
        System.out.println("Resultat= "+metier.calcul());
    }
}
