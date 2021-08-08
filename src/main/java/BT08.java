import java.util.Scanner;

public class BT08 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int month = Integer.parseInt (str1);
        String str2 = scan.nextLine();
        int year = Integer.parseInt(str2);
        if (month==1||month==3||month==5||month==7||month==8||month==10|month==12){
            System.out.println("Thang nay co 31 ngay");
        }if (month==4||month==6||month==9||month==11){
            System.out.println("Thang nay co 30 ngay");
        }if (year%4==0 & month==2){
            System.out.println("Thang nay co 29 ngay");
        }if(year%4!=0 && month==2) {
            System.out.println("Thang nay co 28 ngay");
        }
    }
}
