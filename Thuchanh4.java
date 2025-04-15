package thuchanh4;

import java.util.Scanner;

public class Thuchanh4 {

    Scanner sc = new Scanner(System.in);

    void timmax3so() {
        System.out.println("nhap so thu 1: ");
        int a = sc.nextInt();
        System.out.println("nhap so thu 2: ");
        int b = sc.nextInt();
        System.out.println("nhap so thu 3: ");
        int c = sc.nextInt();
        int max = 0;
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("so lon nhat la: " + max);
    }

    boolean songuyento() {
        System.out.println("nhap so bat ki: ");
        int n = sc.nextInt();
        boolean check = true;
        if (n <= 1) {
            check = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check == true) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
        return true;
    }

    void ptbac1() {
        System.out.println("nhap he so a: ");
        float a = sc.nextFloat();
        System.out.println("nhap he so b: ");
        float b = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt co vo so nghiem");
            }
        }
        if (a == 0) {
            if (b != 0) {
                System.out.println("pt vo nghiem");
            }
        }
        if (a != 0) {
            double x = -b / a;
            System.out.println("pt co 1 nghiem la " + x);
        }
    }

    static double del(double n) {
        double gandung = n;
        double do9xac = 0.000001;

        while (Math.abs(gandung * gandung - n) > do9xac) {
            gandung = (gandung + n / gandung) / 2;
        }

        return gandung;
    }

    void ptbac2() {
        System.out.print("nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("nhap he so b: ");
        double b = sc.nextDouble();

        System.out.print("nhap he so c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("phuong trinh co nghiem kep: x = " + x);
        } else {
            double sqrtDelta = del(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);

            System.out.println("phuong trinh co 2 nghiem:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    void tinhngay() {
        System.out.print("nhap ngay: ");
        int day = sc.nextInt();

        System.out.print("nhap thang: ");
        int month = sc.nextInt();

        System.out.print("nhap nam: ");
        int year = sc.nextInt();
        int daysInMonth = songaytrongthang(month, year);
        if (day < 1 || day > daysInMonth || month < 1 || month > 12 || year < 1) {
            System.out.println("ngay khong hop le.");
        } else {

            day++;
            if (day > daysInMonth) {
                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            System.out.println("ngay tiep theo la: " + day + "/" + month + "/" + year);
        }
    }

    int songaytrongthang(int month, int year) {
        switch (month) {
            case 2:
                if (namnhuan(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    static boolean namnhuan(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Thuchanh4 p = new Thuchanh4();
        //p.timmax3so();
        //p.songuyento();
        //p.ptbac1();
        //p.ptbac2();
        p.songaytrongthang(15, 4);
    }

}
