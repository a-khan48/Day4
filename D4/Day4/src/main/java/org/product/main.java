package org.product;
public class main {
    public static void main(String[] args){
        product Apples = new product("apple", 3, 1.25 );
        Apples.printProduct();
        Apples.totalCost();
    }
}
class product {

    private double productCost;
    private int productQuantity;
    private String productName;
    public product(String productName, int productQuantity, double productCost){
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productCost = productCost;
    }

    public void totalCost(){
        double totalPrice;
        totalPrice = productCost * productQuantity;
        System.out.println("The total cost for " + productQuantity + " " + productName + "(s) is: " + totalPrice);
    }
    public void printProduct(){
        System.out.println(productName + "(s) cost " + productCost + ". " + productQuantity + " were purchased.");
    }
}
