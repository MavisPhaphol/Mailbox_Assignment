//For Assignment2
public class Person {
    private String name;
    private int ticketNumber;
    private static int nextTicketNumber;
    //default CONSTRUCTOR
    public Person(){
        name="NO NAME";
        ticketNumber=nextTicketNumber;
        nextTicketNumber++;
    }
    //overloaded CONSTRUCTOR
    public Person(String newName){
        name=newName;
        ticketNumber=nextTicketNumber;
        nextTicketNumber++;
    }
    //override
    @Override
    public String toString(){
        return ticketNumber+"\t"+name;
    }
}
