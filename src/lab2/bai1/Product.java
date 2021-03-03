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
public class Product {
    private String tenMHang;
    private String hangSX;
    private float donGia;

    public Product() {
    }

    public Product(String tenMHang, String hangSX, float donGia) {
        this.tenMHang = tenMHang;
        this.hangSX = hangSX;
        this.donGia = donGia;
    }

    public String getTenMHang() {
        return tenMHang;
    }

    public void setTenMHang(String tenMHang) {
        this.tenMHang = tenMHang;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập tên mặt hàng : ");
        tenMHang = sc.nextLine();
        System.out.println("mời nhập tên hãng sản xuất : ");
        hangSX = sc.nextLine();
        System.out.println("mời nhâp đơn giá : ");
        donGia = sc.nextFloat();
    }
    public  void xuat(){
        System.out.println("mặt hàng bạn nhập là :"+tenMHang);
        System.out.println("hãng sản xuất bạn nhập là: "+hangSX);
        System.out.println("đơn giá bạn nhập là: "+donGia);
    }
    public void sort(Product []a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i].donGia>a[j].donGia) {
                    Product temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
            
        }
    }
    
}
