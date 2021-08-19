import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = genMatrix(4,4,4,10);
        printMatrix(a);
        System.out.println("Gia tri can tim: " + findX(a) );
        System.out.println("Mang toan so nguyen to " + isMetrixPrime(a));
        System.out.println("Tong so dong: " + totalColumn(a));
        System.out.println("Tong so cot: " + totalRow(a));
        System.out.println("Tong duong cheo chinh: " + totalMainDiagonal(a));
        System.out.println("Tong duong cheo phu: " + totalExtraDiagonal(a));
        System.out.println("Tong tren duong cheo chinh: " + totalUpMainDiag(a));
        System.out.println("Tong Matrix: " + totalMatrix(a));
        System.out.println("Tong duoi duong cheo chinh: " + totalDownMainDiag(a));
        System.out.println("Tong tren duong cheo phu: " + totalUpExtraDiag(a));
    }

    public static int[][] main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong");
        int r = sc.nextInt();
        System.out.println("Nhap so cot");
        int c = sc.nextInt();
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                ret[i][j] = sc.nextInt();
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%5d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] genMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor((Math.random() * (max - min) + min));
            }
        }
        return ret;
    }
    //1. Tim gia tri X

    public static boolean findX(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        int X = sc.nextInt();
        boolean result = false;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] == X) {
                    return true;
                }
            }
        }
        return false;
    }

    //2a. Kiem tra so nguyen to
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //2b. Kiem tra Metrix nguyen to
    public static boolean isMetrixPrime(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (!isPrime(a[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // 3. Tim gia tri lon nhat trong ma tran
    public static int isMaxMtric(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int totalColumn(int[][] a) {
        System.out.println("Dong muon tinh tong");
        Scanner scD = new Scanner(System.in);
        int d = scD.nextInt();
        int sumD = 0;
        int sumC = 0;
        for (int i = 0; i < a[0].length; i++) {
            sumD += a[d][i];
        }
        return sumD;
    }

    public static int totalRow(int[][] a) {
        Scanner scC = new Scanner(System.in);
        System.out.println("Cot muon tinh tong");
        int c = scC.nextInt();
        int sumC = 0;
        for (int i = 0; i < a.length; i++) {
            sumC += a[i][c];
        }
        return sumC;
    }

    public static int totalMainDiagonal(int[][] a) {
        int sumMainDiagonal = 0;
        for (int i = 0; i < a[0].length; i++) {
            sumMainDiagonal += a[i][i];
        }
        return sumMainDiagonal;
    }

    public static int totalExtraDiagonal(int[][] a) {
        int sumExtraDiagonal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > 0; j--) {
                sumExtraDiagonal += a[j][i];
            }
        }
        return sumExtraDiagonal;
    }

    public static int totalMatrix(int[][] a) {
        int sumMatrix = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sumMatrix += a[i][j];
            }
        }
        return sumMatrix;
    }

    public static int totalUpMainDiag(int[][] a) {
        int sumUpMainDiag = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sumUpMainDiag += a[i][j];
            }
        }
        return sumUpMainDiag;
    }

    public static int totalDownMainDiag(int[][] a) {
        int sumDownMainDiag = totalMatrix(a) - totalUpMainDiag(a) + totalMainDiagonal(a);
        return sumDownMainDiag;
    }

    public static int totalUpExtraDiag(int[][] a) {
        int sumUpExtraDiag = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                sumUpExtraDiag += a[i][j];
            }
        }
        return sumUpExtraDiag;
    }

    public static int totalDownExtraDiag(int[][] a) {
        int sumDownExtraDiag = totalMatrix(a) - totalUpExtraDiag(a) + totalExtraDiagonal(a);
        return sumDownExtraDiag;
    }
}

