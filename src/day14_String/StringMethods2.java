package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
         str = str.replace("Java","Python"); //"Python is fun, I love learning Python"

        System.out.println("str ="+str);
        System.out.println("str ="+ str);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail");

        System.out.println("email =" + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
         sentence = sentence.replace("Python","");//"Java Java   C# C# C++ C++"
        System.out.println("sentence ="+ sentence);

        sentence = sentence.replace("  ","");

        System.out.println("sentence =" +sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
         s =s.replace("Dog","Cat");
        System.out.println("s =" + s);

        String s3 ="C# is fun,C# is cool";

         s3 = s3.replace("C#","Java");
        System.out.println("s3 =" + s3);

        String s5 = "Java";
        s5=s5.replace("a","e");
        System.out.println("s5 =" + s5);

        System.out.println("-----------------------------------------------");

        String result = "Java Java Java";

        result = result.replaceFirst("Java","Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#","Java");
        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a","o");
        System.out.println(result3);
















    }
}
