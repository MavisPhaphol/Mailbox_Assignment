public class RegularBox extends Box{
    private String items;
    private double weight;

    //Constructor
    public RegularBox(){
        super();
        items="";
        weight=0;
    }

    //Overload Constructor
    public RegularBox(String delivery, String returnAdd, double wid, double len, double hei, int count, double weigh, String item){
        super(delivery, returnAdd, wid, len, hei, count);
        items=item;
        weight=weigh;
    }

    //Getters
    public String getItems() {
        return items;
    }
    public double getWeight() {
        return weight;
    }

    //Override toString()
    @Override
    public String toString(){
        return getId()+"\n"+getDeliveryAddress()+"\n"+getReturnAddress()+"\n"+
                getWidth()+" x "+getLength()+" x "+getHeight()+"\nItems: "+getItems()
                +"\nCount: "+getCount()+"\nWeight: "+getWeight();
    }
}
