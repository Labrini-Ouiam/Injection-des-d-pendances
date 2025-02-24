package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier{
    //Coublage faible
    private IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t= dao.getData();
        double res =t*23;
        return res;
    }

    //pour injecter dans la variable dao un objet
    //d'une class qui implement l'interface Idao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
