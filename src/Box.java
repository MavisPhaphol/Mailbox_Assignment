public abstract class Box extends Mail {
    private double height;
    private int count;

    //Constructor
    public Box(){
        super();
        height=0;
        count=0;
    }

    //Overload Constructor
    public Box(String delivery, String returnAdd, double wid, double len, double hei, int count){
        super(delivery,returnAdd,wid,len);
        height=hei;
        this.count=count;
    }

    //Getter
    public double getHeight() {
        return height;
    }
    public int getCount() {
        return count;
    }

    //Override toString()
    public String toString(){
        return getId()+"\n"+getDeliveryAddress()+"\n"+getReturnAddress()+'\n'+getWidth()+" x "+getLength()+" x "+getHeight();
    }
}
