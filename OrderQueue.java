public class OrderQueue {
    private int stock;
    private int queueSize = 0;
    LinkedQueue<CustomerOrder> Queue = new LinkedQueue<CustomerOrder>();

    public void addStock(int add){
        stock = stock + add;
    }

    public OrderQueue(){
        stock = 0;
    }

    public OrderQueue(int stock){
        this.stock = stock;
    }

    public void addOrder(int quantity){
        CustomerOrder order = new CustomerOrder(quantity);
        Queue.enqueue(order);
        this.queueSize = queueSize + 1;
    }

    public void fulfilloneOrder(){
        Queue.getFront().ShipProduct();
        this.stock--;
        if (Queue.getFront().quantity == 0){
            Queue.dequeue();
            this.queueSize = queueSize - 1;
        }
    }

    public void fulfillallOrders(){
        while (this.stock > 0){
            Queue.getFront().ShipProduct();
            this.stock--;
            if(Queue.getFront().quantity == 0){
                Queue.dequeue();
                this.queueSize = queueSize - 1;
            } 
        }
    }

    public String toString(){
        return "" + Queue.getFront().quantity;
    }
}
