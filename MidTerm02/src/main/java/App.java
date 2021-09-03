import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] arrg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkPassword(str);

    }

    public static void checkPassword(String str) {
        if (str.length() < 10) {
            System.out.println("Weak Password");
        }else {
            Pattern pt1 = Pattern.compile("\\W");
            Pattern pt2 = Pattern.compile("([0-9])");
            Pattern pt3 = Pattern.compile("([a-zA-Z])");

            boolean isSpecialCharExists = pt1.matcher(str).find();
            boolean isNumberExists = pt2.matcher(str).find();
            boolean isLetterExists = pt3.matcher(str).find();
            if (!isSpecialCharExists || !isNumberExists || !isLetterExists) {
                System.out.println(isSpecialCharExists);
                System.out.println(isNumberExists);
                System.out.println(isLetterExists);

                System.out.println("Your password is not strong enough");
            }
        }
    }

}

