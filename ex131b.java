public class ex131b {
    public static void main(String[] args) {
        String location = "Utah";
        double salesTax = .00;
        if (location == "Utah"){
            salesTax = .047;
        }
        else{
            salesTax = .05;
        }
        System.out.println("Your sales tax rate is " + salesTax * 100 + "%.");
    }
}
