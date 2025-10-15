//driver of the first assignment (3/3)
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[]args){
        OrderList restaurantOrder=new OrderList();
        Order order=new Order();
        Scanner userInput=new Scanner(System.in);
        int menuOption=0;
        while (menuOption!=6){//6 is terminating
            System.out.println("Please select a menu option:\n1- Create Order\n2- Delete Order\n3- Ready Order\n4- Print Order\n5- Print all orders\n6- Exit");
            menuOption=userInput.nextInt();
            if (menuOption==1){//adding order
                String[] addOrder=new String[3];
                for (int index=0;index<order.items.length;index++){
                 System.out.print("Enter item "+(index+1)+": ");
                 addOrder[index]= userInput.next();
                 userInput.nextLine();
                }
                Order newOrder=new Order(addOrder);
                restaurantOrder.addOrder(newOrder);
                System.out.println("Order has been added.");
            }
            else if(menuOption==2){//removing order
                System.out.print("Please enter order id: ");
                int idRemove=userInput.nextInt();
                restaurantOrder.removeOrder(idRemove);
                System.out.println("Order has been removed");
            }
            else if (menuOption==3){//order ready
                System.out.print("Please enter order id: ");
                int idReady= userInput.nextInt();
                restaurantOrder.readyOrder(idReady);
                System.out.println("Order has been set to \"Ready\".");
            }
            else if (menuOption==4){//printing one order
                System.out.print("Please enter order id: ");
                int idChosen= userInput.nextInt();
                if (restaurantOrder.printOrder(idChosen)==null){
                    System.out.println("No order with such id");
                }
                restaurantOrder.printOrder(idChosen);
            }
            else if (menuOption==5){//print all order
                Order printing = new Order();
                System.out.println("READY");
                if (restaurantOrder.equals(true)){
                    restaurantOrder.printOrder();
                }
                System.out.println("PENDING");
                restaurantOrder.printOrder();
            }
        }
    }
}
