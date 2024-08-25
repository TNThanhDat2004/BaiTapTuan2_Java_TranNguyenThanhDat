/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

 
public class ChuongTrinh {
     public static void main(String[] args) {

        SinhVien itStudent = new SinhVienIT("Doan Van Bo", 8.0, 7.5, 6.5);
        itStudent.xuat();


        SinhVien bizStudent = new SinhVienBiz("CMT8", 7.0, 8.5);
        bizStudent.xuat();
    }
}
