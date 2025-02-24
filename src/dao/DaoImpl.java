package dao;

@Componement
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version BD");
        double temp=20;
        return temp;
    }
}
