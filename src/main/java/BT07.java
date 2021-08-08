import java.util.Scanner;

public class BT07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int t = Integer.parseInt(str);
        int price;
        if (t<=1){
            price = 15000;
            System.out.println("Tong so tien la: " + price + "VND");
        }if (t >= 2 && t <= 5) {
            price = 15000 + (t-1)*13500;
            System.out.println("Tong so tien la: " + price + "VND");
        }if (t >= 6 && t <= 120){
            price = 15000 + 4*13500 + (t-5)*11000;
            System.out.println("Tong so tien la: " + price + "VND");
        }if (t>120){
            price = (15000 + 4*13500 + (t-5)*11000)*90/100;
            System.out.println("Tong so tien la: " + price + "VND");
        }
    }
}
