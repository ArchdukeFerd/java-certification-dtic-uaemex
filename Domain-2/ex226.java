public class ex226 {
    public static void main(String[] args) {
        String status = "unknown";
        int totalQty = 40;

        if (totalQty >= 100){
            status = "Gold";
        }
        else if (totalQty >= 50){
            status = "Silver";
        }
        else{
            status = null;
        }
        System.out.println(status);
    }
}
