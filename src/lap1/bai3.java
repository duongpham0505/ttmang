
package lap1;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        //giải phương trình ax2+bx+c=0

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("mời nhập a");
            a = sc.nextInt();

        } while (a == 0);
        System.out.println("mời nhập  b");
        b = sc.nextInt();
        System.out.println("mời nhập c");
        c = sc.nextInt();
        System.out.println("phương trình bạn vừa nhập là : " + a + "X^2 +" + b + "X +" + c + "= 0");

        int d = b * b - 4 * a * c;
        float x1, x2;
        if (d > 0) {
            x1 = (float) (-b - Math.sqrt(d)) / (2 * a);
            x2 = (float) (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("phương trình có nghiệm :"+x1);
            System.out.println("phương trình có nghiệm :"+x2);
        } else if (d < 0) {
            System.out.println("phương trình vô nghiệm");
        }
        else if(d==0){
            float x = -c/a;
            System.out.println("phương tình có nghiệm kếp là : "+x);
        }
    }
}

