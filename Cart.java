
package javaapplication156;

public class Cart {
    int customerId;
    int nProducts;
    Product[] products;
    
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
   
    int count =0;
    public void addProduct(Product productToAdd){
    products[count] = productToAdd;
    count++;    
    }
    
    public void removeProduct(int productId){
        for(int i=0;i<nProducts;i++){
            if(products[i].getProductId() == productId){
                products[i] = products[nProducts-1];
                products[nProducts-1] = null;
                nProducts--;
            }
        }
        
    }
    
    float totalPrice=0;
    public float calculatePrice(){
        for(int i=0;i<nProducts;i++){
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }
    
    public Order placeOrder(){
        if(nProducts > 0){
        //float totalPrice = calculatePrice();
        int orderId = (int) (Math.random()*1000);
        // int orderId = 500;
        Order newOrder = new Order(customerId, 1, products, totalPrice);
        newOrder.printOrderInfo();
        return newOrder;
        }
        else{
            System.out.println("No products in the cart to place an order.");
            return null;
        }
    }
}
