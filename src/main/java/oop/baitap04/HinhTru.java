/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap04;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron{
    
    //Khai bao du lieu
    private double chieucao;
    
    //Dinh nghia cac phuong thuc
    
    public HinhTru(){
        super(); //goi constructor cua lop tren
        chieucao=1.0;
    }
    
    public HinhTru(double bankinh, double chieucao){
        super(bankinh); //goi constructor cua lop tren
        this.chieucao =chieucao;
    }
    
    public void setChieucao(double chieucao){
        this.chieucao=chieucao;
    }
    
    public double getChieucao(){
        return chieucao;
    }
    
    public double tinhDienTich(){
        return 2*super.tinhDienTich()+super.tinhChuVi()*chieucao;
    }
    public double tinhTheTich(){
        return super.tinhDienTich()*chieucao;
    }
}
