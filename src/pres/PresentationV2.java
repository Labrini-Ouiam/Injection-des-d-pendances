package pres;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(new File("config.txt"));
            // Lit la première ligne du fichier, qui devrait contenir le nom de la classe DAO
            String daoClassname = scanner.nextLine();

            // Charge la classe spécifiée par daoClassname
            Class cDao = Class.forName(daoClassname);

            // Crée une nouvelle instance de la classe chargée
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            // Appelle la méthode getData() sur l'instance de DAO et affiche le résultat
            System.out.println(dao.getData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
