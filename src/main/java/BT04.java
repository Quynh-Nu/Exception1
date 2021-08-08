import java.util.Scanner;

public class BT04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int a = Integer.parseInt(str1);
        String str2 = scan.nextLine();
        int b = Integer.parseInt(str2);
        String str3 = scan.nextLine();
        int c = Integer.parseInt(str3);
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta < 0 || a==0 & b==0){
            System.out.println("delta = " + delta);
            System.out.println("Phuong trinh vo nghiem");
        } else if (a==0 & b!=0){
            System.out.println("Phuong trinh co 1 nghiem x =" + (float)-c/b);
        } else if (delta == 0 ){
            System.out.println("delta = " + delta);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (float)-b/(2*a));
        } else {
            System.out.println("delta = " + delta);
            System.out.println("Phuong trinh co nghiem x1 = " + (float)(-b+Math.sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co nghiem x2 = " + (float)(-b-Math.sqrt(delta))/(2*a));

        }

    }
}
