import java.util.Scanner;
public class BT01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = Integer.parseInt(str);
        if (n == 1){
            System.out.println("Mot");
        } else if (n==2){
            System.out.println("Hai");
        }else if (n==3){
            System.out.println("Ba");
        }else if (n==4){
            System.out.println("Bon");
        }else if (n==5){
            System.out.println("Nam");
        }else if (n==6){
            System.out.println("Sau");
        }else if (n==7){
            System.out.println("Bay");
        }else if (n==8){
            System.out.println("Tam");
        }else if (n==9){
            System.out.println("Chin");
        }else {
            System.out.println("Khong hop le");
        }
    }
}
