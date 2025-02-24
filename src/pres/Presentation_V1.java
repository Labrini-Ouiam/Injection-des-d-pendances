package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Presentation_V1 {
    public static void main(String[] args) {
       /*
        Injection des dépendances par instanciation statique
        */
//        DaoImpl d=new DaoImpl();
//        MetierImpl metier=new MetierImpl(d); //Injection des dépendances via la constructeur
//        //metier.setDao(d); //Injection via le setter
//        System.out.println("Resultat= "+metier.calcul());

        DaoImplV2 d=new DaoImplV2();
        MetierImpl metier=new MetierImpl(d); //Injection des dépendances via la constructeur
        //metier.setDao(d); //Injection via le setter
        System.out.println("Resultat= "+metier.calcul());
    }
}
