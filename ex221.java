public class ex221 {
    public static void main(String[] args) {
        String product1 = "House Blend";
        String product2 = "Sunatra";

        System.out.println(product1 != product2);
        System.out.println("Our house specials today are " + product1 + " and " + product2 + ".");
        System.out.println("Our house specials today are " + product1.toUpperCase() + " and " + product2.toUpperCase());
        System.out.println(product1.length());
        System.out.println(product1.isEmpty());
    }
}
