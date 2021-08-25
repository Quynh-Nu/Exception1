import entities.PhanSo;
import utility.PhepTinhPhanSo;

import java.util.Scanner;

public class App {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int tuso1 = sc.nextInt();
        int mauso1 = sc.nextInt();
        int tuso2 = sc.nextInt();
        int mauso2 = sc.nextInt();
        PhanSo phanSo1 = new PhanSo(tuso1, mauso1);
        PhanSo phanSo2 = new PhanSo(tuso2, mauso2);

        System.out.println("Phan so 1 = " + phanSo1.toString());
        System.out.println("Phan so 2 = " + phanSo2.toString());

        System.out.println("Ket qua phep nhan " + PhepTinhPhanSo.nhanPhanSo(phanSo1, phanSo2));
        System.out.println("Ket qua phep chia " + PhepTinhPhanSo.chiaPhanSo(phanSo1, phanSo2));
        System.out.println("Phan so 1 toi gian? " + PhepTinhPhanSo.kiemTraPhanSoToiGian(phanSo1));
        System.out.println("Phan so 1,2 sau quy dong " + PhepTinhPhanSo.quyDongPhanSo(phanSo1,phanSo2));
        System.out.println("Phan so 1 la am? " + PhepTinhPhanSo.phanSoAmDuong(phanSo1));
        System.out.println("Phan so 1 co lon hon phan so 2 hay ko? " + PhepTinhPhanSo.soSanhPhanSo(phanSo1, phanSo2));

    }
}
