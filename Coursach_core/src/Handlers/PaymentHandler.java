package Handlers;

import Entities.Check;
import Entities.ShoppingCart;

public class PaymentHandler {

    public void proceed(ShoppingCart cart){
        if (completeTransaction()){
            Check check = new Check(cart);
            check.print();
            if (emailNeeded() != ""){
                check.sendViaEmail(emailNeeded());
            }
        }
    }

    public boolean completeTransaction(){
        return true;
    }

    public String emailNeeded(){
        return "";
    }





}
