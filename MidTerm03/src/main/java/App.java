import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isMonth(n);
        dayInMonth(n);
    }

    public static void isMonth(int n) {
        Boolean isValidMonth = true;
        if (n > 0 && n <= 12) {
            System.out.println("valid month");
        } else {
            System.out.println("invalid month");
        }
    }

    public static void dayInMonth(int n) {
        if (n == 2) {
            System.out.println("Thang " + n + " co 28 ngay");
        } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println("Thang " + n + " co 31 ngay");
        } else if (n == 4 || n == 6 || n == 9 || n == 11) {
            System.out.println("Thang " + n + " co 30 ngay");
        }
    }
}
