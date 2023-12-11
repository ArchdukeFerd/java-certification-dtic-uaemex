public class ex321b {
    public static void main(String[] args) {
        int totalOrders = 1;
        int orderCount = 1;

       do{
            System.out.println("An order will be sent to you in " + orderCount * 30 + " days.");
            orderCount++;
        }
        while (orderCount < totalOrders);
    }
}

/*
 * If the condition needs to run AT LEAST once, use -do- -while- loop, if it doesnt' have to run at least once, it's okay to use just a -while- loop.
 */