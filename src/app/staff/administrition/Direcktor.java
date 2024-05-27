package app.staff.administrition;

import app.staff.specialist.Kassir;
import org.springframework.beans.factory.annotation.Autowired;

public class Direcktor {
    @Autowired
    private Kassir kassir;
    @Autowired
    private Administrator administrator;
    @Autowired
    private SheifCook sheifCook;

    public void setKassir(Kassir kassir) {
        this.kassir = kassir;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public void setSheifCook(SheifCook sheifCook) {
        this.sheifCook = sheifCook;
    }

    public void cheifOrders () {
        administrator.giveOrders();
        sheifCook.giveOrders();
        kassir.work();

    }
}


