import java.util.*;
//Use Person, Dispatcher, Bus files
public class Assignment2 {
    public static void main(String[]args){
        Dispatcher dispatch=new Dispatcher();
        Bus bus=new Bus();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Bus Dispatching System");
        int menu=1;
        while (menu!=0){
            System.out.println("1. Add bus\n2. Add Person to bus\n3. Remove bus\n4. Remove person\n5. List passengers\n6. List busses\n7. Requeue bus\n8. Transfer person\n9. Dispatch bus\n0. Exit");
            menu=userInput.nextInt();
            if(menu==1) {//Adding bus
                Bus newBus=new Bus();
                dispatch.addBus(newBus);
                System.out.println("Bus "+newBus.getBusID()+" added to position "+dispatch.busQueue.indexOf(newBus));
            }
            else if (menu==2) {//Adding person
                System.out.print("Enter bus id: ");
                int busID=userInput.nextInt();
                dispatch.findBus(busID);
                Bus busFound=dispatch.findBus(busID);
                if (busFound!=null){
                    System.out.print("Enter a person's name: ");
                    String personName=userInput.next();
                    bus.addPerson(new Person(personName));
                    System.out.println(personName+" has been added to bus "+busID);
                }
                else{
                    System.out.println("No bus with id "+busID);
                }
            }
            else if (menu==3){//Removing bus
                System.out.print("Enter bus id: ");
                int busID=userInput.nextInt();
                Bus busFound=dispatch.findBus(busID);
                if (busFound!=null){
                    dispatch.removeBus(busID);
                    System.out.println("Bus "+busID+" removed");
                }
                else{
                    System.out.println("No bus with id "+ busID);
                }
            }
            else if (menu==4){//Removing person
                System.out.print("Enter bus id:");
                int busID=userInput.nextInt();
                Bus busFound=dispatch.findBus(busID);
                if (busFound!=null){
                    System.out.print("Enter a person's name: ");
                    String personName=userInput.next();
                    Person removed=bus.findPerson(personName);
                    if (removed!=null){
                        bus.removePerson(removed);
                        System.out.println(personName+" had been removed from bus "+busID);
                    }
                    else{
                        System.out.println("No such person found in bus "+busID);
                    }
                }
                else{
                    System.out.println("No bus with id "+busID);
                }
            }
            else if (menu==5){//Printing passengers list
                System.out.print("Enter bus id:");
                int busID=userInput.nextInt();
                Bus busFound=dispatch.findBus(busID);
                if (busFound!=null){
                    System.out.println("Bus "+busID);
                    bus.getPassengers();
                }
                else{
                    System.out.println("No bus with id "+busID);
                }
            }
            else if (menu==6){//Printing buses list
                System.out.println("BUS QUEUE\n"+dispatch);
            }
            else if (menu==7){//Changing bus position
                System.out.print("Enter bus id:");
                int busID=userInput.nextInt();
                Bus busFound=dispatch.findBus(busID);
                if (busFound!=null){
                    System.out.println("Enter bus position: ");
                    int position=userInput.nextInt();
                    dispatch.addBus(busFound,position);
                    System.out.println("Bus "+busID+" added to position "+busID);
                }
                else{
                    System.out.println("No bus with id "+busID);
                }
            }
            else if (menu==8){//Transferring person
                System.out.print("Enter person's name: ");
                String personName=userInput.next();
                System.out.print("Enter id of bus 1: ");
                int firstBus=userInput.nextInt();
                System.out.print("Enter id of bus 2: ");
                int secondBus=userInput.nextInt();
                Bus firstBusFound=dispatch.findBus(firstBus);
                Bus secondBusFound=dispatch.findBus(secondBus);
                Person personFound=bus.findPerson(personName);
                if (firstBusFound!=null&&secondBusFound!=null){
                    if (personFound!=null){
                        boolean transfer= bus.transferPerson(firstBusFound,secondBusFound,personFound);
                        if (transfer){
                            System.out.println("Person transferred successfully");
                        }
                        else {
                            System.out.println("Person transfer failed");
                        }
                    }
                    else{
                        System.out.println("No person named "+personName);
                    }
                }
                else if (firstBusFound!=null){
                    System.out.println("No bus with id "+secondBus);
                }
                else{
                    System.out.println("No bus with id "+firstBusFound);
                }
            }
            else if (menu==9){//Dispatching bus
                dispatch.dispatchBus();
                if (dispatch.busQueue.isEmpty()){
                    System.out.println("Bus queue is empty");
                }
                else {
                    int busID = bus.getBusID();
                    System.out.println("Bus " + busID + " has been dispatched");
                }
            }
        }
        System.out.println("Shutting down.");
    }
}
