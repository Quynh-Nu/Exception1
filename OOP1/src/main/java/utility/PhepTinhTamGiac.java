package utility;

import entities.TamGiac;

public class PhepTinhTamGiac {
    public static int tinhChuVi(TamGiac tamgiac){
        int chuVi = tamgiac.getA() + tamgiac.getB() + tamgiac.getC();
        return chuVi;
    }
    public static float tinhDienTich(TamGiac tamgiac){
        int chuVi = tinhChuVi(tamgiac);
        float dienTich = (float) Math.sqrt(chuVi * (chuVi - tamgiac.getA()) * (chuVi - tamgiac.getB()) * (chuVi - tamgiac.getC()));
        return dienTich;

    }
}
