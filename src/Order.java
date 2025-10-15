import java.util.*;

//part of the first assignment(1/3)
public class Order {
    private int orderID;
    private static int availableID=1;
    public boolean ready=true;
    public String[] items;
    //constructors
    Order(){
        orderID=availableID;
        availableID++;
        ready=false;
        items= new String[3];
        Arrays.fill(items,"");
    }
    Order(String[] order){
        orderID=availableID;
        ready=false;
        availableID++;
        items=order;
    }
    //getters
    public int getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        StringBuilder orders=new StringBuilder();
        orders.append("Order Number: "+getOrderID()+"\n");
        if (ready==true){
            orders.append("Ready\n");
        }
        else{
            orders.append("Not Ready\n");
        }
        for(String item: items){
            orders.append(item+"\n");
        }
        return orders.toString();
    }
}
