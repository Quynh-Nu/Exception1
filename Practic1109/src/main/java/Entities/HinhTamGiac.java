package Entities;

import Utilities.Calculator;

import java.util.Arrays;

public class HinhTamGiac extends Dagiac {

    public HinhTamGiac(Diem d1, Diem d2, Diem d3) {
        Diem[] diems = new Diem[3];
        diems[0] = d1;
        diems[1] = d2;
        diems[2] = d3;
        setMangDiem(diems);
    }

    @Override
    public double tinhDientich() {
        double a = Calculator.tinhChieuDaiCanh(mangDiem[0], mangDiem[1]);
        double b = Calculator.tinhChieuDaiCanh(mangDiem[1], mangDiem[2]);
        double c = Calculator.tinhChieuDaiCanh(mangDiem[2], mangDiem[0]);
        return Calculator.tinhDienTichTamGiac(a, b, c);
    }

    @Override
    public String toString() {
        return "HinhTamGiac{" +
                "mangDiem=" + Arrays.toString(mangDiem) +
                '}';
    }
}
