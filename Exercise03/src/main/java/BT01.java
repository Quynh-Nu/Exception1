import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        //1a) Tim so đối xứng
        String oneA = "";
        for (int i = str.length() - 1; i >=0 ; --i) {
            oneA = oneA + str.charAt(i);
        }
        int revertOneA = Integer.parseInt(oneA);
        if (revertOneA == n) {
            System.out.println("So nhap vao la so doi xung");
        }else {
            System.out.println("So nhap vao khong la so doi xung");
          }
//       //1b) Tim so chinh phuong
        boolean isFound = false;
        for (int i = 1; i < n; i++) {
            int temp = i*i;
            if (temp == n){
                System.out.println(n + "la so chinh phuong");
                isFound = true;
                break;
            }
        }
        if(isFound==false){
            System.out.println(n + "ko la so chinh phuong");
        }
        // 2d) Nhap so nguyen duong tinh n!
            long s = 1;
            for (int i = 2; i <= n; i++) {
                s *= i;
                if (i == n) {
                    System.out.println(s);
                    break;
                }
            }
        // 2e) Tinh tong cac giai thua
        long tongGiaiThua = 0;
        for (int j = 1; j <= n; j++) {
            long s = 1;
            for (int i = 1; i <= j; i++) {
                s *= i;
                if (i == n) {
                    break;
                }
            }
            tongGiaiThua += s;
            if (j == n) {
                System.out.println(tongGiaiThua);
            }
        }
        // 5) Nhap so nguyen duong n. Xuat ra so nguoc lai
        String revertStr = "";
        for (int i = str.length() - 1; i >=0 ; --i) {
            revertStr = revertStr + str.charAt(i);
        }
        int revertStr1 = Integer.parseInt(revertStr);
        System.out.println(revertStr);
    }
        //4 ) Tinh tong so nguyen to n (0< n < 50)

        if (n >= 2 && n < 50) {
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                boolean isFound = false;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
        else if (n == 1){
            System.out.println("0");
        }
        else {
            System.out.println("Khong hop le");
        }
    }
}
