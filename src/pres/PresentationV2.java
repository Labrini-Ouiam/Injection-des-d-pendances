package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(new File("config.txt"));
            //DaoImplV2 d=new DaoImplV2();

            // Lit la première ligne du fichier, qui devrait contenir le nom de la classe DAO
            String daoClassname = scanner.nextLine();

            // Charge la classe spécifiée par daoClassname
            Class cDao = Class.forName(daoClassname);

            // Crée une nouvelle instance de la classe chargée
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            //MetierImpl metier=new MetierImpl(d);
            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
//            IMetier metier = (IMetier) cDao.getConstructor(IDao.class).newInstance(dao);

            IMetier metier = (IMetier) cDao.getConstructor().newInstance();

            //metier.setDao(d);
            Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier,dao);

            System.out.println("RESULTAT="+metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
