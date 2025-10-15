public class Letter extends Envelope{
    private String letterBody;

    //Constructor
    public Letter(){
        super();
        letterBody="";
    }

    //Overload Constructor
    public Letter(String delivery, String returnAdd, double wid, double len, double thick, String letter){
        super(delivery, returnAdd, wid, len, thick);
        letterBody=letter;
    }

    //Getter
    public String getLetterBody() {
        return letterBody;
    }
}
