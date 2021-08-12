import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        int[] isPrime = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("a[%d] = ", i);
            isPrime[i] = sc.nextInt();
        }
        //2a) Kiem tra mang có phai mang toan so nguyen to

        for (int i = 0; i <= isPrime[i]; i++) {
            int i = 0;
            for (int j = 2; j <= isPrime[i]; j++) {
                if (isPrime[i] % j == 0) {
                    System.out.println("false");
                    break;
                } else {
                    System.out.println("true");
                }
            }
            // 2b) Kiem tra mang co phai la mang tang dan
            boolean isEven = true;
            for (int i = 0; i < isPrime.length - 1; i++) {
                for (int j = i + 1; j < isPrime.length; j++) {
                    if (isPrime[i] >= isPrime[j]) {
                        isEven = false;
                        break;
                    }
                }
            }
            if (isEven) {
                System.out.println("Mang tang dan");
            } else {
                System.out.println("Mang ko tang tang dan");
            }
            // 3a) Mang co bao nhieu so chia het cho 4 nhung khong chia het cho 5
            int count = 0;
            for (int i = 0; i < isPrime.length; i++) {
                if (isPrime[i] % 4 == 0 && isPrime[i] % 5 != 0) {
                    count += 1;
                }
            }
            System.out.println("Co " + count + " so");
            // 3b) Tinh tong cac so nguyen to co trong mang
            int sumPrime = 0;
            for (int i = 0; i < isPrime.length; i++) {
                boolean isFound = false;
                for (int j = 2; j < isPrime[i]; j++) {
                    if (isPrime[i] % j == 0) {
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) {
                    sumPrime = sumPrime + isPrime[i];
                }
            }
            System.out.println(sumPrime);
        }
    }
}

