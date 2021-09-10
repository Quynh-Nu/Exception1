package Utilities;

import Entries.GiangVienThinhGiang;

import java.net.PortUnreachableException;

public class Calulator {
    public static int sumSalaryGvcc(int salary, int totalHours){
        if(totalHours <= 40){
            return salary;
        }else{
        }
        return salary + 100000*(totalHours - 40);
    }
    public static int sumSalaryGvtg(int totalHousrs){
        return 200000*totalHousrs;
    }

    public static boolean highestSalary(int a, int b){
       if(a > b){
           return true;
       }else return false;
    }
}
