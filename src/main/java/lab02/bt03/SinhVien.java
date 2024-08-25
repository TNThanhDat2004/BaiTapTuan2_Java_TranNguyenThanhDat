/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt03;


public abstract class SinhVien {
      protected String hoTen;
    protected String nganh;
    
     public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();


    public String getHocLuc() {
        double diem = getDiem();
        if (diem >= 9) {
            return "Xuat sac";
        } else if (diem >= 7.5) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }


    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
