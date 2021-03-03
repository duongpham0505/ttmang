
package lap1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a,b,max,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên  a:");
        a= sc.nextInt();
        System.out.println("mời nhập số nguyên  b: ");
        b = sc.nextInt();
        System.out.println("nhaacpj c");
        int c = sc.nextInt();
        System.out.println("hai số bạn nhập là   " +a+" vÃ  "+b +" và "+c);
         
        max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        min = a; 
        if(min >b ) min = b;
        if(min >c) min = c;
         System.out.println("số lớn nhất là "+ max);
         System.out.println("số nhỏ nhất là "+ min);
        
        
    }
}
