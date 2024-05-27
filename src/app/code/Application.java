package app.code;

import app.staff.administrition.Direcktor;
import app.staff.administrition.Administrator;
import app.staff.administrition.SheifCook;
import app.staff.specialist.Kassir;
import app.staff.specialist.procutction.Cook;
import app.staff.specialist.procutction.HellpCook;
import app.staff.specialist.staffHall.Barmen;
import app.staff.specialist.staffHall.Waiter;
import app.staff.specialist.staffHall.Clening;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

public class Application {
    public static void main(String[] args) {


  AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.coonfig");
  Direcktor direcktor =context.getBean(Direcktor.class);
    direcktor.cheifOrders();



//        Cook cook = new Cook();
//        HellpCook hellpCook = new HellpCook();
//
//        SheifCook sheifCook = new SheifCook();
//        sheifCook.setCook(cook);
//        sheifCook.setHellpCook(hellpCook);
//
//        Barmen barmen = new Barmen();
//        Waiter waiter = new Waiter();
//        Clening clening = new Clening();
//
//        Administrator administrator = new Administrator();
//        administrator.setBarmen(barmen);
//        administrator.setWaiter(waiter);
//        administrator.setClening(clening);
//
//        Kassir kassir = new Kassir();
//
//
//        Direcktor direcktor = new Direcktor();
//        direcktor.setAdministrator(administrator);
//        direcktor.setSheifCook(sheifCook);
//        direcktor.setKassir(kassir);
//
//
//        direcktor.cheifOrders();
//

    }
}
