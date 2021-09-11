package Entities;

import java.util.Arrays;

public class HinhTron extends Dagiac {

    private int bk;

    public HinhTron(Diem d1, int bk) {
        Diem[] diems = new Diem[1];
        diems[0] = d1;
        setMangDiem(diems);
        this.bk = bk;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    @Override
    public double tinhDientich() {
        return this.bk * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "bk=" + bk +
                ", mangDiem=" + Arrays.toString(mangDiem) +
                '}';
    }
}
