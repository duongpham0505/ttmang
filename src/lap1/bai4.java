
package lap1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int giaithua = 1,tong=1;
//        System.out.println("mời nhâp n:");
//        int n= sc.nextInt();
//        for (int i = 1; i < n; i++) {
//            giaithua*=i;
//            tong *=giaithua;
//            System.out.println("lần lặp thứ "+i+" giai thừa là: "+giaithua+" tổng là: "+tong);

//        }
    int soDien;
    float tienDien;
        do {            
            System.out.println("mời nhập số điên :");
            soDien = sc.nextInt();
            if(soDien<0)
            System.out.println("nhập lại");
        } while (soDien<=0);
        if (soDien<50) {
            tienDien = soDien*50;
            System.out.println("số tiền điện nhà bạn là: "+tienDien);
        }
        else{
            tienDien = 50*5000 +(soDien-50)*1200; 
            System.out.println("số tiền điện nhà bạn là: "+tienDien);
        }
        
    }
}
