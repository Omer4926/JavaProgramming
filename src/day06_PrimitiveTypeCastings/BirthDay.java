package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {
      String name  = "John";
      int birthDay = 25;
      String birthMonth ="April";
      int birthYear = 1995;

      //John was born on month/day/year.
        System.out.println(name + " was born on " + birthMonth + "/"  + birthDay + "/" + birthYear );

        System.out.println("----------------------------");

        // My favorite book is "bookName"
        String bookName ="The Rich Dad and The Poor Dad";

        System.out.println(" My favorite book is \"" + bookName + "\"");



    }
}
/*name, birthDay(int),birthMonth(String),birthYear(int)
if name = "John"
birthDay = 25
birthMonth = "April"
birthYears = 1995 ;
output:
        John born  on April/25/1995;
 */