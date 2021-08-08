import java.util.Scanner;

public class BT03 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String srt1 = scan.nextLine();
        int a = Integer.parseInt(srt1);
        String srt2 = scan.nextLine();
        int b = Integer.parseInt(srt2);
        if (a==0 & b==0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a==0 & b!=0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float nghiem = (float) -b/a;
            System.out.println("Phuong trinh co nghiem: " + nghiem);
        }
    }
}
