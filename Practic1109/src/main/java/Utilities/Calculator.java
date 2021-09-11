package Utilities;

import Entities.Dagiac;
import Entities.Diem;

public class Calculator {

    public static double tinhChieuDaiCanh(Diem d1, Diem d2){
        double dy = (d1.getY() - d2.getY()) * (d1.getY() - d2.getY());
        double dx = (d1.getX() - d2.getX()) * (d1.getX() - d2.getX());
        return Math.sqrt(dx + dy);
    }

    public static double tinhDienTichTamGiac(double a, double b, double c){
        double chuvi = (a + b + c)/2;
        return Math.sqrt(chuvi * (chuvi- a) * (chuvi - b) * (chuvi - c));
    }

    public static double tinhTienManhDat(double dtich, int gia){
        return dtich * gia;
    }

    public static double tinhTongTien(Dagiac[] dagiacs, int gia){
       double sum = 0;
       if(dagiacs.length == 0){
           System.out.println("Chua co manh dat nao duoc mua!");
       }else{
           for(int i = 0; i < dagiacs.length; i++){
               sum = sum + tinhTienManhDat(dagiacs[i].tinhDientich(), gia);
           }
       }
       return sum;
    }
}
