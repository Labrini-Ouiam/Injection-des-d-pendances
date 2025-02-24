package pres;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import dao.IDao;
import dao.DaoImpl;
import metier.MetierImpl;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class AppConfig {
    @Bean
    public IDao dao() {
        return new DaoImpl();
    }

    @Bean
    public MetierImpl metier() {
        return new MetierImpl();
    }
}
