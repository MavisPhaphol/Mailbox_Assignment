public class Mail {
    private String deliveryAddress;
    private String returnAddress;
    private double width;
    private double length;
    private int id;
    private static int nextID=0;

    //Constructor
    public Mail(){
        deliveryAddress="";
        returnAddress="";
        width=0;
        length=0;
        id=nextID;
        nextID++;
    }

    //Overload Constructor
    public Mail(String deliver, String returnAdd,double wid, double len){
        deliveryAddress=deliver;
        returnAddress=returnAdd;
        width=wid;
        length=len;
        id=nextID;
        nextID++;
    }

    //Getters
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getReturnAddress() {
        return returnAddress;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public int getId() {
        return id;
    }

    //Override toString()
    @Override
    public String toString(){
        return getId()+"\n"+getDeliveryAddress()+"\n"+getReturnAddress();
    }
}
