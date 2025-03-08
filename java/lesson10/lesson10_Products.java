package lesson10;
//Create a class Product having id, quantity, name, sellingPrice, costPrice and taxRate
//Create a class named Inventory that stores all products of an online store.
// The Inventory class contains the following:

//A private ArrayList data field named product_List that define the list of products of
// an online store.

//A constructor that sets up an ArrayList of products.

//A method named addOrder

//method named getTotaltax()

//Note tax =30% of selling price

import java.util.ArrayList;

//A method displayAllProducts
public class lesson10_Products {
    public static void main(String[] args) {

//        int id, int quantity, String name, double sellingPrice, double costPrice, double taxRate

        Product_1 prod1 = new Product_1(1, 2, 10, 7, "First");
        Product_1 prod2 = new Product_1(2, 1, 20, 13, "Second");
        Product_1 prod3 = new Product_1(3, 1, 30, 21, "Third");

        Inventory_1 inven1 = new Inventory_1();
        inven1.addOrder(prod1);
        inven1.addOrder(prod2);
        inven1.addOrder(prod3);

        inven1.getTotalTax();
        System.out.println(inven1.getTotalTax());

        inven1.displayAllProducts();

    }
}
//Create a class Product having id, quantity, name, sellingPrice, costPrice and taxRate
class Product_1{
    int id;
    int quantity;
    String name;
    double sellingPrice;
    double costPrice;
    double taxRate = 30;

    public Product_1(int id, int quantity,  double sellingPrice, double costPrice, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.costPrice = costPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getTax() {
        return taxRate;
    }

    @Override
    public String toString() {
        return "Product_1{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", costPrice=" + costPrice +
                ", taxRate=" + taxRate +
                '}';
    }
}
// The Inventory class contains the following:

//A private ArrayList data field named product_List that define the list of products of
// an online store. X

//A constructor that sets up an ArrayList of products. X

//A method named addOrder X

//method named getTotaltax()

//Note tax =30% of selling price
class Inventory_1{
    ArrayList<Product_1> productsList;
    public Inventory_1(){
        productsList = new ArrayList<>();
    }
    void addOrder(Product_1 p) {
        productsList.add(p);
    }


    double getTotalTax() {
        double total = 0;
        for (Product_1 p : productsList) {
            total +=
                    (p.getTax()/ 100) * (p.getQuantity() * p.getSellingPrice())
            ;
        }
        return total;
    }

    void displayAllProducts(){
        for (Product_1 p : productsList) {
            System.out.println(p);
        }
    }
}