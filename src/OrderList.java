//part of the first assignment (2/3)
public class OrderList {
    private Order[] orderList=new Order[1];
    private int length=0;

    //adding
     public void addOrder(Order order){
         if (length==orderList.length) {
             Order[] addingOrder = new Order[orderList.length * 2];
             for (int index = 0; index < orderList.length; index++) {
                 addingOrder[index] = orderList[index];
             }
             orderList = addingOrder;
         }
         orderList[length]=order;
         length++;
    }
    public void removeOrder(int id){
         for (int index=0;index< orderList.length;index++){
             if (orderList[index].getOrderID()==id){
                 orderList[index]=null;
             }
         }
    }
    //ready
    public void readyOrder(int id){
         for (int index=0;index< orderList.length;index++){
             if (id==orderList[index].getOrderID()){
                 orderList.equals(true);
             }
         }
    }
    //sorting
    private void sortOrder(){
         for (int index=0;index<orderList.length;index++){
             for (int secondIndex=1;secondIndex<orderList.length-index;secondIndex++){
                 if (orderList[secondIndex-1].getOrderID()>orderList[secondIndex].getOrderID()){
                     Order temporary= orderList[secondIndex-1];
                     orderList[secondIndex-1]=orderList[secondIndex];
                     orderList[secondIndex]=temporary;
                 }
             }
         }
    }
    //printing with parameter
    public String printOrder(int id){
         for (int index=0;index< orderList.length;index++){
             if (orderList[index]!=null && orderList[index].getOrderID()==id){
                 orderList.toString();
             }
         }
         return "No such order found";
    }
    //printing
    public String printOrder(){
         sortOrder();
         return orderList.toString();
    }
}
