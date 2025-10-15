public class Flat extends Envelope{
    private String contents;

    //Constructor
    public Flat(){
        super();
        contents="";
    }

    //Overload Constructor
    public Flat(String delivery, String returnAdd, double wid, double len, double thick, String content){
        super(delivery, returnAdd, wid, len, thick);
        contents=content;
    }

    //Getter
    public String getContents() {
        return contents;
    }
}
