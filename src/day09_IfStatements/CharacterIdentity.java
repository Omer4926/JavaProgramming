package day09_IfStatements;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch = '@';
        String result = "";
        if(ch >= '0' && ch <= '9'){
            result ="Digit";
        }else if( (ch >= 'A' && ch <= 'Z' ) || (ch >= 'a' && ch <= 'z')){
            result = "Alphabetic";
        }else{
            result = "Special Character";
        }
        System.out.println(result);
    }
}
