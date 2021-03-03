package lap1;

import java.util.Scanner;

public class bai5 {

    int n;

    public int nhapN() {

        return n;
    }

    void nhap() {

        boolean check = false;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("mời bạn nhập n: ");
                n = sc.nextInt();
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("bạn phải nhập vào là số :" + e.toString());
                check = false;
            }
        } while (check == false);
    }

    // s = 1+1/2+...+1/n
    public float tinhtong1(int m) {
        float s1 = 0;
        for (int i = 0; i <= m; i++) {
            s1 += 1 / i;
        }
        return s1;
    }

    // s = 1 + 1/2! + ...+ 1/n!
    float tinhtong2(int m) {
        int s2 = 0;
        float giaithua = 1;
        for (int i = 1; i <= m; i++) {
            giaithua *= i;
            s2 += giaithua;
        }
        return s2;
    }

    void menu() {
        System.out.println("1: nhập số nguyên dương: ");
        System.out.println("2: tính tổng s = 1 + 1/2 + ...+ 1/n ");
        System.out.println("3: tính tổng s = 1 + 1/2! + ...+ 1/n! ");
        System.out.println("4. thoát");
    }

    public static void main(String[] args) {
        bai5 b = new bai5();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            boolean check = false;
            do {
                b.menu();
                try {
                    System.out.println("mời nhập lựa chọn ");
                    n = sc.nextInt();
                    check = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("bạn cần nhập vào là số: " + e.toString());
                    check = false;
                }
            } while (check == false);
            switch (n) {
                case 1:
                    b.nhap();
                    break;
                case 2:
                    System.out.println("tổng 1 có dạng" + b.tinhtong1(b.nhapN()));
                    break;
                case 3:
                    System.out.println("tổng 2 là " + b.tinhtong2(b.nhapN()));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("bạn không có lựa chọn");
                    break;
            }
        } while (n != 4);

    }
}
