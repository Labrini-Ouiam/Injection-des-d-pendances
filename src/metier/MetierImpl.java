//package metier;
//
//import dao.DaoImpl;
//import dao.IDao;
//
//public class MetierImpl implements IMetier {
//    //Coublage faible
//    private IDao dao;
//
//    public MetierImpl() {
//    }
//
//    public MetierImpl(IDao dao) {
//        this.dao = dao;
//    }
//
//    @Override
//    public double calcul() {
//        double t = dao.getData();
//        double res = t * 23;
//        return res;
//    }
//
//    //pour injecter dans la variable dao un objet
//    //d'une class qui implement l'interface Idao
//    public void setDao(IDao dao) {
//        this.dao = dao;
//    }
//}


package metier;

import org.springframework.beans.factory.annotation.Autowired;
import dao.IDao;

@Componement
public class MetierImpl implements IMetier {
    // Injection de dépendance avec @Autowired
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 66;
        return res;
    }

    // Setter pour injection des dépendances
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}