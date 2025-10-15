import java.util.*;
//DRIVER
//Use Mail, Envelope, Box, Letter, Flat, RegularBox, LiveBox
public class MailRoom {
    //Static Methods
    //For Letters
    private static boolean handleLetter(Letter letter, ArrayList<Mail> deliver){
        double length= letter.getLength();
        double width=letter.getWidth();
        double thickness=letter.getThickness();
        if (letter.getDeliveryAddress()!=null && letter.getReturnAddress()!=null){
            if (length>=5 && length<=11.5 && width>=3.5 && width<=6.125 && thickness>=0.007 && thickness<=0.25 && (length-width)>=1.5){
                deliver.add(letter);
                return true;
            }
        }
        return false;
    }

    //For Flat
    private static boolean handleFlat(Flat flat, ArrayList<Mail> deliver){
        double length=flat.getLength();
        double width= flat.getWidth();
        double thickness= flat.getThickness();
        if(length>=11.5 && length<=15 && width>=6.125 && width<=12 && thickness>=0.25 && thickness<=0.75 &&flat.getContents().equalsIgnoreCase("DOCUMENTS")){
            deliver.add(flat);
            return true;
        }
        return false;
    }

    //For RegularBox
    private static boolean handleRegularBox(RegularBox regularBox,ArrayList<Mail> deliver){
        double length= regularBox.getLength();
        double width= regularBox.getWidth();
        double height= regularBox.getHeight();
        double weight= regularBox.getWeight();
        int count= regularBox.getCount();
        if (regularBox.getDeliveryAddress()!=null && regularBox.getReturnAddress()!=null && !regularBox.getDeliveryAddress().isEmpty() && !regularBox.getReturnAddress().isEmpty()){
            if (length>=6 && length<=27 && width>=0.25 && width<=17 && height>=3 && height<=17 && weight>=0 && weight<=70 && count>=0 && count<=50){
                deliver.add(regularBox);
                return true;
            }
        }
        return false;
    }

    //For LiveBox
    private static boolean handleLiveBox(LiveBox liveBox, ArrayList<Mail> deliver) {
        double length = liveBox.getLength();
        double width = liveBox.getWidth();
        double height = liveBox.getHeight();
        int count = liveBox.getCount();
        int age = liveBox.getAge();
        if (liveBox.getDeliveryAddress() != null && liveBox.getReturnAddress() != null && !liveBox.getDeliveryAddress().isEmpty() && !liveBox.getReturnAddress().isEmpty()) {
            if (length >= 6 && length <= 27 && width >= 0.25 && width <= 17 && height >= 3 && height <= 17 &&
                    liveBox.getAnimal().equalsIgnoreCase("HONEYBEE") || liveBox.getAnimal().equalsIgnoreCase("CHICKEN")) {
                if (liveBox.getAnimal().equalsIgnoreCase("HONEYBEE") && count >= 0 && count <= 20) {
                    deliver.add(liveBox);
                    return true;
                } else if (liveBox.getAnimal().equalsIgnoreCase("CHICKEN") && count >= 0 && count <= 10 && age >= 0 && age <= 1) {
                    deliver.add(liveBox);
                    return true;
                }
            }
        }
        return false;
    }

    //Main
    public static void main(String[]args){
        Scanner userInput=new Scanner(System.in);
        ArrayList<Mail> deliver=new ArrayList<Mail>();
        int menu=0;
        System.out.println("Welcome to KSUSPS\n");
        while (menu!=6){
            System.out.println("1- Send letter\n2- Send flat\n3- Send regular box\n4- Send live box\n5- Dispatch items\n6- Quit");
            System.out.print("Enter Option: ");
            menu=userInput.nextInt();
            System.out.println();
            if (menu==1){//Send letter
                userInput.nextLine();
                System.out.print("Enter the delivery address: ");
                String delivery= userInput.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress= userInput.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width= userInput.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length= userInput.nextDouble();
                System.out.print("Enter the thickness of your mail: ");
                double thickness= userInput.nextDouble();
                userInput.nextLine();
                System.out.print("Enter the contents of your letter: ");
                String contents= userInput.nextLine();
                Letter letter =new Letter(delivery,returnAddress,width,length,thickness,contents);
                if (handleLetter(letter,deliver)){
                    System.out.println("\nLetter accepted for delivery.\n");
                }
            }
            else if (menu==2) {//Send Flat
                userInput.nextLine();
                System.out.print("Enter the delivery address: ");
                String delivery = userInput.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = userInput.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = userInput.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = userInput.nextDouble();
                System.out.print("Enter the thickness of your mail: ");
                double thickness = userInput.nextDouble();
                userInput.nextLine();
                System.out.print("Enter the contents of your flat: ");
                String contents = userInput.nextLine();
                Flat flat = new Flat(delivery, returnAddress, width, length, thickness, contents);
                if (handleFlat(flat, deliver)) {
                    System.out.println("\nFlat accepted for delivery.\n");
                }
            }
            else if(menu==3){//Send regular box
                userInput.nextLine();
                System.out.print("Enter the delivery address: ");
                String delivery = userInput.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = userInput.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = userInput.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = userInput.nextDouble();
                System.out.print("Enter the height of your mail: ");
                double height= userInput.nextDouble();
                System.out.print("Enter how many items your box has: ");
                int count= userInput.nextInt();
                System.out.print("Enter the weight of your box: ");
                double weight= userInput.nextDouble();
                userInput.nextLine();
                System.out.print("Enter the contents of your box: ");
                String contents= userInput.nextLine();
                RegularBox regularBox=new RegularBox(delivery,returnAddress,width,length,height,count,weight,contents);
                if(handleRegularBox(regularBox,deliver)){
                    System.out.println("\nRegular box accepted for delivery.\n");
                }
                else{
                    System.out.println("\nRegular box cannot be mailed.\n");
                }
            }
            else if(menu==4){//Send live box
                userInput.nextLine();
                System.out.print("Enter the delivery address: ");
                String delivery = userInput.nextLine();
                System.out.print("Enter the return address: ");
                String returnAddress = userInput.nextLine();
                System.out.print("Enter the width of your mail: ");
                double width = userInput.nextDouble();
                System.out.print("Enter the length of your mail: ");
                double length = userInput.nextDouble();
                System.out.print("Enter the height of your mail: ");
                double height= userInput.nextDouble();
                System.out.print("Enter how many items your box has: ");
                int items= userInput.nextInt();
                System.out.print("Enter what animal is being shipped: ");
                String animals= userInput.next();
                System.out.print("Enter age of the oldest animal, in days: ");
                int age= userInput.nextInt();
                LiveBox liveBox=new LiveBox(delivery,returnAddress,width,length,height,items,animals,age);
                if (handleLiveBox(liveBox,deliver)){
                    System.out.println("\nLive box accepted for delivery.\n");
                }
            }
            else if(menu==5) {//Dispatching
                if (!deliver.isEmpty()){
                    System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY:\n==========");
                    for (int index=0;index<deliver.size();index++){
                        System.out.println(deliver.get(index).toString()+"\n==========");
                    }
                    deliver.clear();
                    System.out.println();
                }
                else {
                    System.out.println("Delivery queue is empty.\n");
                }
            }
        }
        System.out.println("Quitting...");
    }
}
