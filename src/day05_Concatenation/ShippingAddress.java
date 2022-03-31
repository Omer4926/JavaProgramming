package day05_Concatenation;

import jdk.swing.interop.SwingInterOpUtils;

public class ShippingAddress {
    public static void main(String[] args) {
     /*...*/
         String name = " James " ,
                buildingNumber = "1123B",
                streetName = "Jones Branch Dr",
                city = "Mclean",
                state = "VA",
                zipCode = "22031A";
        /*...*/
        //  System.out.println( name + "\n" + " " + streetName + " \n" + city + "," + state + " " + zipCode);
        String address = name + "\n" + " " + streetName + " \n" + city + "," + state + " " + zipCode;
        System.out.println(address);


        /*
        String name = " James kİNG ";
        String buildingNumber = " 1123B ";
        String  streetName = " Jones Branch Dr ";
        String city  = "Mclean ";
        String  state= " VA ";
        String  zipCode= "22031A ";

         */




    }
}
