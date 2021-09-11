package Entities;

import java.util.Arrays;

public class HinhVuong extends Dagiac{
    private int cr;

    public HinhVuong(Diem d1, int cr) {
        Diem[] diem = new Diem[1];
        diem[0] = d1;
        setMangDiem(diem);
        this.cr = cr;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    @Override
    public double tinhDientich() {
        return this.cr * this.cr;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "cr=" + cr +
                ", mangDiem=" + Arrays.toString(mangDiem) +
                '}';
    }
}
