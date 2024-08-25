
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap04;

/**
 *
 * @author ADMIN
 */
public class HinhTron {
    //khai bao du lieu
    private double bankinh;
    //dinh nghia cac phuong thuc
    
    public HinhTron(){
        bankinh=1.0;
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    
    public double tinhDienTich()
    {
        return Math.PI*bankinh*bankinh;
    }
    
    public double tinhChuVi()
    {
        return Math.PI*2*bankinh;
    }

    @Override
    public String toString() {
        return "HinhTron" + "bankinh=" + bankinh + ", Dien tich:" + tinhDienTich() + 
                ", Chu vi:" + tinhChuVi() +'}';
    }
    
    
}
