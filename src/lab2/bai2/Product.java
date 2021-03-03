/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float donGia;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float donGia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập mã mặt hàng :");
        maHH = sc.nextLine();
        System.out.println("mời nhập tên mặt hàng : ");
        tenHH= sc.nextLine();
        System.out.println("mời nhập số lượng :");
        soLuong = sc.nextFloat();
        System.out.println("mời nhập đơn giá :");
        donGia = sc.nextFloat();
    }
    public void display(){
        System.out.println("mã hàng hóa : "+maHH);
        System.out.println("tên hàng hóa : "+tenHH);
        System.out.println("số lượng : "+soLuong);
        System.out.println("đơn giá : "+donGia);
    }
}
