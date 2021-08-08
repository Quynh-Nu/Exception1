import java.util.Scanner;

public class BT02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = str.charAt(0);
        if (Character.isLowerCase(c)){
            System.out.println(Character.toUpperCase(c));
        } else {
            System.out.println(Character.toLowerCase(c));
        }
    }
}
