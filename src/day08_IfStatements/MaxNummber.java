package day08_IfStatements;

public class MaxNummber {
    public static void main(String[] args) {

        int n1 = 100,
            n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal   = n1 == n2;

        if(n1IsMax){
            System.out.println(n1+" is maximum");
        }
        if(n2IsMax){
            System.out.println(n2+" is maximum");
        }
        if(equal){
            System.out.println("Equal");
        }
    }
}
