public class ex321a {
    public static void main(String[] args) {
        int totalOrders = 4;
        int orderCount = 1;

        while (orderCount < totalOrders){
            System.out.println("An order will be sent to you in " + orderCount * 30 + " days.");
            orderCount++;
        }
    }
}
