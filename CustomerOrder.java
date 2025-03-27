public class CustomerOrder {
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder(){
    }
    public CustomerOrder(int quantity){
        this.quantity = quantity;
    }

    public void ShipProduct(){
        if (quantity > 0){
          quantity--;  
        }
        
    }
}