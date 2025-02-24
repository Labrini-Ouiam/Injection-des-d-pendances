package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import metier.IMetier;

public class Presentation {
    public static void main(String[] args) {
        // Charger le contexte Spring avec les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Récupérer le bean MetierImpl
        IMetier metier = context.getBean(IMetier.class);

        // Utiliser le bean
        double result = metier.calcul();
        System.out.println("Résultat du calcul : " + result);
    }
}
