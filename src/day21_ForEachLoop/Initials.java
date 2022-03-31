package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] name = {"Elminur Ablimit","Ali Kiliç","Hulya Keles","Sinem Kaya","Begench Begenjov","Ruveyda Sahin",
        "Jonathan Holly","Alshaun Rodgers","Manas Kalenov","Gulsen Sohret"};

        for (String each : name) {
            String initial = each.charAt(0)+"."+ each.charAt( each.indexOf(" ")+1 );
            System.out.println(initial);
        }
    }
}
