
package lap1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a; 
        float f;
        double d;
        long l;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên : ");
        a = sc.nextInt();
        System.out.println("mời nhập số thực float :");
        f = sc.nextFloat();
        System.out.println("mời nhập số thực double: ");
        d= sc.nextDouble();
        System.out.println("mời nhập kiểu  long:");
        l = sc.nextLong();
        System.out.println("mời nhập char");
        sc.nextLine();
        ch = sc.nextLine().charAt(0);
        System.out.println("mời nhập chuỗi ");
        str = sc.nextLine();
        
        System.out.println(" ::::::::::::::::::::::::: ");
        System.out.println("kiểu số nguyên bạn nhập là: " +a);
        System.out.println("kiểu float bạn nhập "+f);
        System.out.println("kiểu double bạn nhập  double"+d);
        System.out.println("kiểu char"+ch);
        System.out.println("kiểu chuỗi  string "+str);
    }
}
