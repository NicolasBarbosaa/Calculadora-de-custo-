public class Order { 
boolean isFilled; 
double billAmount; 
String shipping; 
String coupon; 
public Order(boolean filled, double cost, String shippingMethod, String couponCode) {    
    isFilled =filled; 
    billAmount =cost; 
    shipping =shippingMethod; 
    coupon= couponCode; 

    if (billAmount > 24.00) { 
    System.out.println("High value item!"); 
    } else { 
    System.out.println("Low value item!"); 
    } 

}
 public void ship() { 

    if (isFilled) { 
    System.out.println("Shipping"); 
    } else { 
    System.out.println("Order not ready");
    } 
    } 
public double calculateShipping(){ 
    if(shipping ==  "regular") { 
    return 0; 
    }else if(shipping == "express" && coupon == "ship50"){ 
    return 0.85; 
    }else if(shipping == "express"){ 
    return 1.75; 
    }else{ 
    return 0.50; 
    } 
}

public static void main(String[] args) { 

Order book = new Order(true, 9.99, "express", "ship50"); Order chemistrySet = new Order(false, 72.50, "regular", "couponInvalid"); 

book.ship(); 

double preco = book.calculateShipping(); 

System.out.println(preco); 
} 
}
