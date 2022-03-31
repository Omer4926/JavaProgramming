package day10_NestedIf;

import jdk.swing.interop.SwingInterOpUtils;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String Location ="";
        int groupNumber =0;
        String teacher ="";
        if(grade >= 1 && grade <= 6){
            if(grade == 1){
                Location = "Apple orchard";
                groupNumber = 3;
                teacher ="Ms.Smith";
            }else if(grade == 2){
                Location ="zoo";
                groupNumber = 7;
                teacher ="Mr.Lee";
            }else if(grade ==3){
                Location = "Aquarium";
                groupNumber= 5;
                teacher ="Ms.Wilson";
            }

        }else{
            System.out.println("Invalid Grade");
        }
        System.out.println("Location -"+ Location);
        System.out.println("number of groups -"+groupNumber);
        System.out.println("teacher in charge -"+teacher);


    }
}
