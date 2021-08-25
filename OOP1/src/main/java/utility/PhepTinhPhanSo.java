package utility;

import entities.PhanSo;

import java.util.ArrayList;
import java.util.List;

public class PhepTinhPhanSo {
    public static PhanSo nhanPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        int tuso = phanSo1.getTuSo() * phanSo2.getTuSo();
        int mauso = phanSo1.getMauSo() * phanSo2.getMauSo();
        PhanSo phanSo = new PhanSo(tuso, mauso);
        return phanSo;
    }

    public static PhanSo chiaPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        {
            int tuso = phanSo1.getTuSo() * phanSo2.getMauSo();
            int mauso = phanSo1.getMauSo() * phanSo2.getTuSo();
            PhanSo phanSo = new PhanSo(tuso, mauso);
            return phanSo;
        }
    }

    public static boolean kiemTraPhanSoToiGian(PhanSo phanSo1) {
        int tuso = phanSo1.getTuSo();
        int mauso = phanSo1.getMauSo();
        for (int i = 2; i <= tuso || i <= mauso; i++) {
            if (tuso % i == 0 && mauso % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<PhanSo> quyDongPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        List<PhanSo> list = new ArrayList<>();
        int tuso1 = phanSo1.getTuSo() * phanSo2.getMauSo();
        int mauso1 = phanSo1.getMauSo() * phanSo2.getMauSo();
        PhanSo phanSo = new PhanSo(tuso1, mauso1);
        int tuso2 = phanSo2.getTuSo() * phanSo1.getMauSo();
        int mauso2 = phanSo2.getMauSo() * phanSo1.getMauSo();
        PhanSo phanSo3 = new PhanSo(tuso2, mauso2);
        list.add(phanSo);
        list.add(phanSo3);
        return list;
    }

    public static boolean phanSoAmDuong(PhanSo phanSo1) {
        int tuso = phanSo1.getTuSo();
        int mauso = phanSo1.getMauSo();
        if (tuso < 0 && mauso < 0) {
            return false;
        }
        return tuso < 0 || mauso < 0;
    }

    public static boolean soSanhPhanSo(PhanSo phanSo1, PhanSo phanSo2) {
        List<PhanSo> phanSoList = quyDongPhanSo(phanSo1, phanSo2);
        PhanSo ps1 = phanSoList.get(0);
        PhanSo ps2 = phanSoList.get(1);
        if (ps1.getTuSo() > ps2.getTuSo()) {
            return true;
        }
        return false;

    }

}





