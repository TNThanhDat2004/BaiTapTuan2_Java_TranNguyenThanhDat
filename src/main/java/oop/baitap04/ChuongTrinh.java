/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap04;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        HinhTron htron = new HinhTron(5);
        System.out.println("Hinh tron: Ban kinh:" + htron.getBankinh() + ", Dien tich:" + htron.tinhDienTich() + ", Chu vi: " + htron.tinhChuVi());
        
        HinhTru htru = new HinhTru(5 ,2);
        System.out.println("Hinh tru: Ban kinh:" + htru.getBankinh() + 
                ", Chieu cao:" + htru.getChieucao() +
                ", Dien tich:" + htru.tinhDienTich() + 
                ", The tich:" + htru.tinhTheTich());
    }
}
