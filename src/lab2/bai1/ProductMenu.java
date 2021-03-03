/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProductMenu {
    static void menu(){
        System.out.println("danh sách lựa chọn :");
        System.out.println("1.nhập thông tin cho sản phầm");
        System.out.println("2.hiển thị thông tin vừa nhập ");
        System.out.println("3. sắp xếp theo thứ tự giảm dần");
        System.out.println("4.thoát!!");
    }
    public static void main(String[] args) {
        int n = 0;
        Product a = new Product();
        Product [] product = null;
        do {            
            menu();
            System.out.println("mời bạn nhập lựa chọn!!");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch(n){
                case 1:
                    System.out.println("mời bạn nhập số lượng");
                    int m;
                    m = Integer.parseInt(sc.nextLine());
                    product = new Product[m];
                    
                    for (int i = 0; i < m; i++) {
                        product[i] =new  Product();
                        product[i].nhap();
                        
                    }
                    break;
                case 2:
                    if (product == null) {
                        System.out.println("bạn chưa nhập dữ liệu");
                    }else{
                        System.out.println("dữ liệu bạn vừa nhập là: ");
                        System.out.println("=================");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thông tin bạn nhập thứ "+(i+1)+" ");
                            product[i].xuat();
                        }
                    }
                    break;
                case 3: 
                    a.sort(product);
                    System.out.println("dữ liệu sau khi sắp xếp là :");
                    for (int i = 0; i < product.length; i++) {
                        System.out.println("mặt hàng thứ "+(i+1));
                        product[i].xuat(); 
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("bạn không có lựa chọn");
            }
        } while (n!=4);
    }
}
