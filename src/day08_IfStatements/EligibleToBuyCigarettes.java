package day08_IfStatements;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        byte age = 21;

        boolean eligible = age >= 21;

        if(eligible){
            System.out.println("Eligible to buy");
        }
        if(!eligible){
            System.out.println("Not eligible to buy");
        }
    }
}
