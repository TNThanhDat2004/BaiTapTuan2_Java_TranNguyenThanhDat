/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt03;


public class SinhVienBiz extends SinhVien{
    private double diemMarketing;
    private double diemSales;
    
     public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }


    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
