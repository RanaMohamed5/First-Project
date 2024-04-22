
package javaapplication156;

public class Order {
    int customerId;
    int orderId;
    Product [] products;
    float totalPrice;

    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }
    
    public void printOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("Order ID: "+ orderId);
        System.out.println("Customer ID: "+ customerId);
        System.out.println("Products: ");
        for(Product productToAdd : products){ //productToAdd is the current product to add
            System.out.println(productToAdd.getName() +" - $"+ productToAdd.getPrice());
        }
        System.out.println("Total Price: $"+ totalPrice);
    }
}
