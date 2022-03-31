package day13_String;




public class StringMethods {
    public static void main(String[] args) {

/*

        String word = "Cydeo";
        // index:      01234
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar ="+ thirdChar);

        char tenthChar = word.charAt(9);

        System.out.println("tenthChar =" + tenthChar);

        System.out.println("-----------------------------------------------");

        String s1 = "Batch 25 is the bst batch";

        int totalChars = s1.length();
        System.out.println("totalChars ="+ totalChars);

        char lastChar = s1.charAt( s1.length()-1 );
        System.out.println("LastChar ="+lastChar);

        System.out.println("------------------------------------------------------");
*/
        String str = "wooden spoon";
        str = str.toUpperCase(); // "WOODEN SPOON"

        System.out.println(str);
        // Today is a great day to learn java programming language
        String sentence ="Today is a great day to learn java programming language. ";
        String str2 ="JAVA";
         str2 = str.toLowerCase() ;
        System.out.println(str2);

    }
}
