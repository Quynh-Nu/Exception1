import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args){
        //Scanner ts = new Scanner(System.in);
        Scanner scY = new Scanner(System.in);
        System.out.println("Nhap Year");
        int y = scY.nextInt();
        Scanner scM = new Scanner(System.in);
        Scanner scD = new Scanner(System.in);
        Scanner scH = new Scanner(System.in);
        Scanner scMi = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        Scanner date = new Scanner(System.in);

        System.out.println("Nhap Month");
        int m = scM.nextInt();
        System.out.println("Nhap Day");
        int d = scM.nextInt();
        System.out.println("Nhap Gio");
        int h = scH.nextInt();
        System.out.println("Nhap Phut");
        int mi = scM.nextInt();
        System.out.println("Nhap Giay");
        int s = scS.nextInt();
        isLeapYear(scY);
        System.out.println("secondOfMonth: " + secondOfMonth(scM, scY));
        secondOfYear(scM, scY);
        secondUntilDate(date);
    }
    public static boolean isLeapYear(Scanner scY) {
        boolean isLeapYear = false;
        int y = scY.nextInt();
        for (int i = 1970; i <= y; i++) {
            if (i % 4 == 0) {
                return true;
            }
        }
        return false;
    }

    public static long secondOfMonth(Scanner scM, Scanner scY) {
        long m = scM.nextLong();
        long secondOfMonth = 0;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            secondOfMonth = 31 * 84400;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            secondOfMonth = 30 * 84400;
        }
        if (m == 2 && isLeapYear(scY)) {
            secondOfMonth = 29 * 84400;
        }
        if (m == 2 && !isLeapYear(scY)) {
            secondOfMonth = 28 * 84400;
        }
        return secondOfMonth;
    }
    public static long secondOfYear(Scanner scM, Scanner scY){
        long y = scY.nextLong();
        long secondOfYear = 0;
        for (int i = 1; i <= 12 ; i++) {
            if(isLeapYear(scY)){
                secondOfYear += secondOfMonth(scM, scY);
            }
        }
        System.out.println(secondOfYear);
        return secondOfYear;
    }
    public static long secondUntilDate(Scanner date){
        int day = date.nextInt();
        long secondUntilDate = day * 86400;
        return secondUntilDate;
    }

}

