import java.util.*;
//For Assignment2
public class Dispatcher {
    ArrayList<Bus> busQueue=new ArrayList<Bus>();
    //ADD buses
    public int addBus(Bus bus){
        busQueue.add(bus);
        int queue = busQueue.size();
        return queue;
    }
    //ADD more buses (WITH POSITION ADDED IN)
    public int addBus(Bus bus, int position){
        busQueue.add(position,bus);
        if (position>busQueue.size()){
            busQueue.add(busQueue.size()+1,bus);
        }
        return position;
    }
    //FIND bus
    public Bus findBus(int id){
        for (Bus bus: busQueue){
            if (bus.getBusID()==id){
                return bus;
            }
        }
        return null;
    }
    //REMOVE bus
    public Bus removeBus(int id){
        Iterator<Bus> forBus= busQueue.iterator();
        while (forBus.hasNext()){
            Bus bus=forBus.next();
            if (bus.getBusID()==id){
                forBus.remove();
                return bus;
            }
        }
        return null;
    }
    //DISPATCH bus
    public Bus dispatchBus(){
        if (busQueue.isEmpty()){
            return null;
        }
        return busQueue.remove(0);
    }
    //OVERRIDE
    @Override
    public String toString(){
        StringBuilder print= new StringBuilder();
        for (Bus bus:busQueue){
            print.append(bus.toString()).append("\n");
        }
        return print.toString();
    }
}
