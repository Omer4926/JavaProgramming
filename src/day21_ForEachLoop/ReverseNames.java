package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kiliç", "Hulya Keles", "Sinem Kaya", "Begench Begenjov", "Ruveyda Sahin",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
