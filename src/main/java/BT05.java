import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BT05 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int a = Integer.parseInt(str1);
        String str2 = scan.nextLine();;
        int b = Integer.parseInt(str2);
        String str3 = scan.nextLine();
        int c = Integer.parseInt(str3);
        String str4 = scan.nextLine();
        int d = Integer.parseInt(str4);
        int min = a;
        if (a>b){
             min = b;
        } if (min>c){
             min = c;
        } if (min>d){
            min = d;
        }
        System.out.println("min = " + min);
    }
}
