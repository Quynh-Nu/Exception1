import java.util.Scanner;

public class DE3_BT01 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int year = Integer.parseInt(str);
        if (year%4==0 && year%100!=0){
            System.out.println("Nam nhuan");
        }else {
            System.out.println("Nam thuong");
        }
    }
}
