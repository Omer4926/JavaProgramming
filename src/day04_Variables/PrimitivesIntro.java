package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

    // age: 38 years old
         byte x = 38;
    // weight: 160 pounds
         short y = 160;
    //salary:10000 $
   // short salary = 100000;    // 100000 is out of short range
        int salary = 100_000;    // int is the  preferred data type for integer numbers


        long asset = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        // #
         char ch2 = 35;
        System.out.println("ch2 ="+ ch2);

        char ch3 = 35000;
      //  System.out.println("ch3 ="+ ch3);
        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed );
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String  name ="Wooden Spoon";
        String city = "Mclean";
        String state= "Virginia";
        String country = "USA";
        System.out.println(" name = " + name);
        System.out.println("country = "+ country);
        System.out.println("state =" + state);






    }
}
