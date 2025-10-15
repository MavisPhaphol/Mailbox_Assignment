public class LiveBox extends Box{
    private String animal;
    private int age;

    //Constructor
    public LiveBox(){
        super();
        animal="";
        age=0;
    }

    //Overload Constructor
    public LiveBox(String delivery, String returnAdd, double wid, double len, double hei, int count, String newAnimal, int yearsAge){
        super(delivery, returnAdd, wid, len, hei, count);
        animal=newAnimal;
        age=yearsAge;
    }

    //Getters
    public String getAnimal() {
        return animal;
    }
    public int getAge() {
        return age;
    }

    //Override toString()
    @Override
    public String toString(){
        return getId()+"\n"+getDeliveryAddress()+"\n"+getReturnAddress()+"\n"+
                getWidth()+" x "+getLength()+" x "+getHeight()+"\nAnimal: "+getAnimal()
                +"\nCount: "+getCount()+"\nAge (Days): "+getAge();
    }
}
