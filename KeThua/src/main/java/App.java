import Entries.GiangVienCoHuu;
import Entries.GiangVienThinhGiang;
import Utilities.Calulator;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Nhap thong tin giao vien co huu

        String name = sc.nextLine();
        String email = sc.nextLine();
        String address = sc.nextLine();
        int phone = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        int totalHour = Integer.parseInt(sc.nextLine());
        GiangVienCoHuu gvch = new GiangVienCoHuu(name, email, address, phone, salary, totalHour);
        System.out.println(gvch);
        int salaryGvch = Calulator.sumSalaryGvcc(gvch.getSalary(), gvch.getTotalHours());
        String name1 = sc.nextLine();
        String email1 = sc.nextLine();
        String address1 = sc.nextLine();
        int phone1 =  Integer.parseInt(sc.nextLine());
        String companyAdress1 = sc.nextLine();
        int hour1 = Integer.parseInt(sc.nextLine());
        GiangVienThinhGiang gvtg = new GiangVienThinhGiang(name1, email1, address1, phone1, companyAdress1, hour1);
        System.out.println(gvtg);
        int salaryGhtg = Calulator.sumSalaryGvtg(gvtg.getHours());
        System.out.println("Tong luong = " + (Calulator.sumSalaryGvcc(gvch.getSalary(), gvch.getTotalHours()) + Calulator.sumSalaryGvtg(gvtg.getHours())));
        System.out.println(Calulator.highestSalary(salaryGvch, salaryGhtg));

    }
}
