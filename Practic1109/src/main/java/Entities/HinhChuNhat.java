package Entities;

import java.util.Arrays;

public class HinhChuNhat extends Dagiac {
    int cd, cr;

    public HinhChuNhat(Diem d1, int cd, int cr) {
        Diem[] diems = new Diem[1];
        diems[0] = d1;
        setMangDiem(diems);
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double tinhDientich() {
        return this.cd * this.cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "cd=" + cd +
                ", cr=" + cr +
                ", mangDiem=" + Arrays.toString(mangDiem) +
                '}';
    }
}
