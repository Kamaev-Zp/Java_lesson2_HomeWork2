package app.coonfig;


import app.staff.administrition.Administrator;
import app.staff.administrition.Direcktor;
import app.staff.administrition.SheifCook;
import app.staff.specialist.Kassir;
import app.staff.specialist.procutction.Cook;
import app.staff.specialist.procutction.HellpCook;
import app.staff.specialist.staffHall.Barmen;
import app.staff.specialist.staffHall.Clening;
import app.staff.specialist.staffHall.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Direcktor director() {
        return new Direcktor();
    }

    @Bean
    public Administrator administrator() {
        return new Administrator();
    }

    @Bean
    public SheifCook sheifCook() {
        return new SheifCook();
    }

    @Bean
    public Kassir kassir() {
        return new Kassir();
    }

    @Bean
    public Cook cook() {
        return new Cook();
    }

    @Bean
    public HellpCook hellpCook() {
        return new HellpCook();
    }

    @Bean
    public Barmen barmen() {
        return new Barmen();
    }

    @Bean
    public Waiter waiter() {
        return new Waiter();
    }

    @Bean
    public Clening clening() {
        return new Clening();
    }
}