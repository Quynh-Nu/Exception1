import Entities.*;
import Utilities.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap gia tri cua diem 1: ");
        int x1 = Integer.valueOf(sc.nextLine());
        int y1 = Integer.valueOf(sc.nextLine());

        System.out.println("Vui long nhap gia tri cua diem 2: ");
        int x2 = Integer.valueOf(sc.nextLine());
        int y2 = Integer.valueOf(sc.nextLine());

        System.out.println("Vui long nhap gia tri cua diem 3: ");
        int x3 = Integer.valueOf(sc.nextLine());
        int y3 = Integer.valueOf(sc.nextLine());

        System.out.println("Vui long nhap gia tri ban kinh: ");
        int bk = Integer.valueOf(sc.nextLine());

        System.out.println("Vui long nhap chieu dai: ");
        int cd = Integer.valueOf(sc.nextLine());

        System.out.println("Vui long nhap chieu rong: ");
        int cr = Integer.valueOf(sc.nextLine());


        System.out.println("Vui long nhap gia mieng dat");
        int giaMet2 = Integer.valueOf(sc.nextLine());

        Diem d1 = new Diem(x1, y1);
        Diem d2 = new Diem(x2, y2);
        Diem d3 = new Diem(x3, y3);

        Dagiac[] mangManhDatMuonSoHuu = new Dagiac[3];

        Dagiac manhDatHinhTron = new HinhTron(d1, bk);
        System.out.println("Thong tin manh dat : " + manhDatHinhTron);

        Dagiac manhDatTamGiac = new HinhTamGiac(d1, d2, d3);
        System.out.println("Thong tin manh dat : " + manhDatTamGiac);

        Dagiac manhDatHinhChuNhat = new HinhChuNhat(d1, cd, cr);
        System.out.println("Thong tin manh dat : " + manhDatHinhChuNhat);

        mangManhDatMuonSoHuu[0] = manhDatTamGiac;
        mangManhDatMuonSoHuu[1] = manhDatHinhTron;
        mangManhDatMuonSoHuu[2] = manhDatHinhChuNhat;


        double giaDat1 = Calculator.tinhTienManhDat(manhDatHinhTron.tinhDientich(), giaMet2);
        double giaDat2 = Calculator.tinhTienManhDat(manhDatTamGiac.tinhDientich(), giaMet2);
        double giaDat3 = Calculator.tinhTienManhDat(manhDatHinhChuNhat.tinhDientich(), giaMet2);

        double tongTien = Calculator.tinhTongTien(mangManhDatMuonSoHuu, giaMet2);
        System.out.println("Gia mieng dat 1 la : " + giaDat1);
        System.out.println("Gia mieng dat 2 la : " + giaDat2);
        System.out.println("Gia mieng dat 3 la : " + giaDat3);
        System.out.println("Tong so tien de so huu cac mieng dat : " + tongTien);

    }
}

