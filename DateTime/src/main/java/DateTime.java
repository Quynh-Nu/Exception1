import java.time.*;
import java.util.Scanner;

public class DateTime {
  public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        Scanner scY = new Scanner(System.in);
        Scanner scM = new Scanner(System.in);
        Scanner scD = new Scanner(System.in);
        Scanner scH = new Scanner(System.in);
        Scanner scMi = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        System.out.println("DateTime: " + timeConvertToDate(ts));
        dateConverToTimestap(scY, scM, scD, scH, scMi, scS);
    }

    public static LocalDateTime timeConvertToDate(Scanner ts) {
        System.out.println("Nhap timestamp");
        Long epoch = ts.nextLong();
        LocalDateTime ldt = Instant.ofEpochSecond(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
        return ldt;
    }

    public static void dateConverToTimestap(Scanner scY, Scanner scM, Scanner scD, Scanner scH, Scanner scMi, Scanner scS) {
        System.out.println("Nhap Year");
        int y = scY.nextInt();
        System.out.println("Nhap Month");
        int m = scM.nextInt();
        System.out.println("Nhap Day");
        int d = scM.nextInt();
        System.out.println("Nhap Gio");
        int h = scH.nextInt();
        System.out.println("Nhap Phut");
        int mi = scM.nextInt();
        System.out.println("Nhap Giay");
        int s = scS.nextInt();
        LocalDateTime dateTime = LocalDateTime.of(y, m, d, h, mi, s);
        System.out.println("Timestamp: " + dateTime.toEpochSecond(ZoneOffset.UTC));
  }
}