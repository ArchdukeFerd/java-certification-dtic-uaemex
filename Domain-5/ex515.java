public class ex515 {
    static String [] cocoaBrands = new String[4];

    public static void main (String args[]) {
    cocoaBrands[0] = "Regular";
    cocoaBrands[1] = "Dark Chocolate";
    cocoaBrands[2] = null;
    cocoaBrands[3] = "Sugar free";

    printItem(0);
    printItem(4);
    }

    static void printItem(int item) {
    System.out.println("Item number " + item + " is " + cocoaBrands[item]);
    }
}

/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at ex515.printItem(ex515.java:15)
        at ex515.main(ex515.java:11)

    // This indicates that the main method tried called the line 15, which, in turn, tried to call the line 11 and it had an exception that caused the callling of an item in position 4, which doesn't exist in this array.
 */