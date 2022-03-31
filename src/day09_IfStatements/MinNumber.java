package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100,
                n2 = 200;
        if(n1 < n2){

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n2;
        boolean equal = n1 == n2 ;


        if(n1IsMin) { // if n1 is the minimum number
            System.out.println(n1 + " is the minimum number ");
        }
         if(n2IsMin) {// if n2 is the minimum number
             System.out.println(n2 + " is the minimum number ");
         }
         if(equal){ //if n1 is equal to n2
             System.out.println(equal + " is the minimum number ");

        }
        }
    }
}
