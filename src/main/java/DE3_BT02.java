//import java.util.Scanner;
//
//public class DE3_BT02 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str1 = scan.nextLine();
//        int year = Integer.parseInt(str1);
//        String str2 = scan.nextLine();
//        int month = Integer.parseInt(str2);
//        String str3 = scan.nextLine();
//        int day = Integer.parseInt(str3);
//        //a. Xet ngay thang nam co hop le hay ko
//        if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 | month == 12) && day > 31) || ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) || (year % 4 == 0 && month == 2 && day > 29) || (year % 4 != 0 && month == 2 && day > 28) || month > 12) {
//            System.out.println("Khong hop le");
//        } else {
//            System.out.println("Hop le");
//        }
//        //b: Tinh toa ngay sau do 1 ngay
//        if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) || ((month == 4 || month == 6 || month == 9 || month == 11 && day == 30)) || (year % 4 == 0 && month == 2 && day == 29) || (year % 4 != 0 && month == 2 && day == 28)) {
//            int month1 = month + 1;
//            System.out.println("Ngay tiep theo yyyy/mm/dd la: " + year + "/" + month1 + "/" + 1);
//        } else if (month == 12 && day == 31) {
//            int year1 = year + 1;
//            System.out.println("Ngay tiep theo yyyy/mm/dd la: " + year1 + "/" + 1 + "/" + 1);
//        } else {
//            System.out.println("Ngay tiep theo yyyy/mm/dd la: " + year + "/" + month + "/" + (day + 1));
//        }
//        //c: Tinh toan truoc do 1 ngay
//        if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11 || month == 1) && day == 1) {
//            int month1 = month - 1;
//            System.out.println("Ngay tiep theo yyyy/mm/dd la: " + year + "/" + month1 + "/" + 31);
//        } else if ((month==5 || month==7 || month==10 || month=12) && day==1){
//            int month1 = month - 1;
//            System.out.println("Ngay tiep theo yyyy/mm/dd la: " + year + "/" + month1 + "/" + 30);
//        }else if (month==3 && day==1 && year%4=0)
//
//    }
//}
