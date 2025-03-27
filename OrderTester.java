public class OrderTester {
  public static void main(String[] args){

    OrderQueue Queue = new OrderQueue(14);

      Queue.addOrder(5);
      Queue.addOrder(5);
      Queue.addOrder(8);

      System.out.println(Queue); 

      Queue.fulfillallOrders();

      System.out.println(Queue);

      Queue.addStock(10);
      Queue.addOrder(3);
      Queue.addOrder(3);
      Queue.addOrder(5);

      Queue.fulfillallOrders();
      
      System.out.println(Queue);
  }
  
  
}
