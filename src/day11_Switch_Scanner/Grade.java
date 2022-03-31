package day11_Switch_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Grade {
    public static void main(String[] args) {
        char ch = 'B';// ==
        String result ="";
        switch(ch){
                case'A':
                result ="Excellent";
                  break;

                  case'B':
                      result ="Great Job";
                    break;
                case'C':
                    result ="Good";
                    break;
                case'D':
                    result ="Passed";
                    break;
                case'F':
                    result ="Failed";
                    break;
                default:
                    result ="Invalid";

    }




    }
}
