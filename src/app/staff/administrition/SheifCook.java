package app.staff.administrition;

import app.staff.specialist.procutction.Cook;
import app.staff.specialist.procutction.HellpCook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

public class SheifCook {
    @Autowired
    private Cook cook;
   @Autowired
    private HellpCook hellpCook;

    public void setHellpCook(HellpCook hellpCook) {
        this.hellpCook = hellpCook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public  void giveOrders() {
        hellpCook.work();
        cook.work();

    }


}
