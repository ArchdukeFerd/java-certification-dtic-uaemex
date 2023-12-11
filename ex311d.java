public class ex311d {
    public static void main(String[] args) {
        int amount = 4;

        switch (amount){
            /* 
            case >=5:
            System.out.println("We'll make a donation on your behalf OwO");
            break;
            */
            case 4:
            System.out.println("Four bag order? We'll throw in another bag for free!");
            break;
            case 3:
            System.out.println("Three bags? We'll toss in another half a bag :)");
            break;
            case 2:
            System.out.println("Two bags? Enjoy a free coaster on us.");
            break;
            default:
            System.out.println("Thank you for your order.");
        }
    }
}
