import java.util.EventListener;

public abstract class Envelope extends Mail {
    private double thickness;

    //Constructor
    public Envelope(){
        super();
        thickness=0;
    }

    //Overload Constructor
    public Envelope(String delivery, String returnAdd, double wid, double len, double thick){
        super(delivery,returnAdd,wid,len);
        thickness=thick;
    }

    //Getter
    public double getThickness() {
        return thickness;
    }

    //Override toString()
    @Override
    public String toString(){
        return getId()+"\n"+getDeliveryAddress()+"\n"+getReturnAddress()+"\n"+getWidth()+" x "+getLength()+" x "+getThickness();
    }
}
