public class ex321d {
    public static void main(String[] args) {
        String [] cocoaBrands = new String[4];

        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark Chocolate";
        cocoaBrands[2] = null;
        cocoaBrands[3] = "Sugar free";

        for (String cocoa : cocoaBrands){
            System.out.println(cocoa);
        }
    }
}

/*
 * If you need to define the number of loops the loop loops, use a -for-, if the group to loop is already defined, use a -for each- loop
 */