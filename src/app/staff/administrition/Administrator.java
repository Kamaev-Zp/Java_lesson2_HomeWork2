package app.staff.administrition;

import app.staff.specialist.procutction.Cook;
import app.staff.specialist.procutction.HellpCook;
import app.staff.specialist.staffHall.Barmen;
import app.staff.specialist.staffHall.Clening;
import app.staff.specialist.staffHall.Waiter;
import org.springframework.beans.factory.annotation.Autowired;

public class Administrator {
    @Autowired
    private Barmen barmen;
    @Autowired
    private Clening clening;
    @Autowired
    private Waiter waiter;


    public void setBarmen(Barmen barmen) {
        this.barmen = barmen;
    }

    public void setClening(Clening clening) {
        this.clening = clening;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void giveOrders(){
        clening.work();
        waiter.work();
        barmen.work();



    }

}

