
package javaapplication156;
import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args) {
     Scanner cs = new Scanner (System.in);
     ElectronicProduct e = new ElectronicProduct("Samsung",1,1,"smartphone",599.99f);
     ClothingProduct cl = new ClothingProduct("Medium","Cotton",2,"T-shirt",19.99f );
     BookProduct b = new BookProduct("O'Reilly","X Publications",3,"OOP",39.99f);
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please enter your id");
        int customerId = cs.nextInt();
        System.out.println("Please enter your name");
        String name = cs.next();
        System.out.println("Please enter your address");
        String address = cs.next();
        Customer c = new Customer(customerId , name, address);
        System.out.println("How many products you want to add to the cart?");
        int nProducts = cs.nextInt();
        Cart cart = new Cart(customerId, nProducts);
        for(int i=0;i<nProducts;i++){
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-shirt 3- OOP");
            int productId = cs.nextInt();
            switch(productId){
                case 1 :
                    cart.addProduct(e);
                    break;
                case 2 :
                    cart.addProduct(cl);
                    break;
                case 3 :
                    cart.addProduct(b);
                    break;
                default :
                    System.out.println("Invalid input!");
            }
        }
       // float total = cart.calculatePrice();
        System.out.print("Your total is $" + cart.calculatePrice() +".  ");
        System.out.println("Would you like to place the order? 1- Yes 2- No");
        int choice = cs.nextInt();
        if(choice == 1){
            cart.placeOrder();
            
        }
        else{
            System.out.println("The order is not placed!");
        }
    }
    
}
