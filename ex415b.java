public class ex415b {
    public static void main(String[] args) {
    Product prod1 = new Product(1, "Tea", "Green Tea", 8.99);
    System.out.println("Our first tea is " + prod1.productName + ".");

    GourmetCoffee gc1 = new GourmetCoffee(4, "Coffee", "Chocolate Donut", 11.99, "chocolate");
    System.out.println("We have a new " + gc1.flavour + " coffee with " + gc1.initStock() + " in stock.");
    }
    
    static class Product {
    int productId;
    String type;
    String productName;
    double price;
    int initStock(){
        return 20;
    }

   Product(int productIdValue, String typeValue, String productNameValue, double priceValue){
        productId = productIdValue;
        type = typeValue;
        productName = productNameValue;
        price = priceValue;
   }

   Product(){
   }
    }
    
    static class GourmetCoffee extends Product {
        String flavour;
        @Override
        int initStock(){
            return 10;
        }

        GourmetCoffee (int productIdValue, String typeValue, String productNameValue, double priceValue, String flavourValue){
            productId = productIdValue;
            type = typeValue;
            productName = productNameValue;
            price = priceValue;
            flavour = flavourValue;
        }
    }
    public static int initStock(){
        return 20;
    }
}