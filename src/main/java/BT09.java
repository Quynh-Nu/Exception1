import java.util.Scanner;

public class BT09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int a = Integer.parseInt(str1);
        String str2 = scan.nextLine();
        int b = Integer.parseInt(str2);
        String str3 = scan.nextLine();
        int c = Integer.parseInt(str3);
        if (a==b && b==c){
            System.out.println("Tam giac deu");
        }else if (a==b || b==c || c==a){
            System.out.println("Tam giac can");
        }else if (b*b == a*a + c*c){
            System.out.println("Tam giac vuong");
        }else {
            System.out.println("Tam giac thuong");
        }
    }
}
