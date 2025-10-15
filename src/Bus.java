import java.util.*;
//For Assignment2
public class Bus {
    private ArrayList<Person> passengers;
    private static int nextID;
    private int busID;
    //CONSTRUCTOR
    public Bus(){
        passengers=new ArrayList<Person>();
        busID=nextID;
        nextID++;
    }
    //GETTER
    public int getBusID() {
        return busID;
    }
    //ADD PERSON
    public void addPerson(Person person){
        passengers.add(person);
    }
    //REMOVE PERSON
    public boolean removePerson(Person person){
        boolean remove=passengers.remove(person);
        return remove;
    }
    //FIND PERSON
    public Person findPerson(String name){
        for (int index=0;index< passengers.size(); index++){
            if (passengers.equals(name)){
                return passengers.get(index);
            }
        }
        return null;
    }
    //TRANSFER PERSON
    public static boolean transferPerson(Bus bus1, Bus bus2, Person person){
        if (bus1.equals(person)){
            bus1.removePerson(person);
            bus2.addPerson(person);
            return true;
        }
        return false;
    }
    //GET PASSENGERS
    public ArrayList<Person> getPassengers() {
        for (Person person: passengers){
            System.out.println(person);
        }
        return passengers;
    }
    //OVERRIDE OF ToString
    @Override
    public String toString(){
        return String.valueOf(getBusID());
    }
}
