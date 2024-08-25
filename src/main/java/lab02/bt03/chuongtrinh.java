/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class chuongtrinh {

    private final ArrayList<SinhVien> ds = new ArrayList<>();

   
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap loai sinh vien (1: IT, 2: Biz, 0: Thoat): ");
            int loai = scanner.nextInt();
            scanner.nextLine();

            if (loai == 0) break;

            System.out.print("Nhap ho ten: ");
            String hoTen = scanner.nextLine();

            if (loai == 1) {
                System.out.print("Nhap diem Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Nhap diem Html: ");
                double diemHtml = scanner.nextDouble();
                System.out.print("Nhap diem Css: ");
                double diemCss = scanner.nextDouble();
                ds.add(new SinhVienIT(hoTen, diemJava, diemHtml, diemCss));
            } else if (loai == 2) {
                System.out.print("Nhap diem Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Nhap diem Sales: ");
                double diemSales = scanner.nextDouble();
               ds.add(new SinhVienBiz(hoTen, diemMarketing, diemSales));
            }
        }
    }

  
    public void xuat() {
        for (SinhVien sv : ds) {
            sv.xuat();
            System.out.println("---------------------------");
        }
    }

    
    public void sinhVienGioi() {
        for (SinhVien sv : ds) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.xuat();
                System.out.println("---------------------------");
            }
        }
    }

 
    public void sapXep() {
        Collections.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });
    }

    public static void main(String[] args) {
       chuongtrinh qlsv = new chuongtrinh();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    qlsv.nhap();
                    break;
                case 2:
                    qlsv.xuat();
                    break;
                case 3:
                    qlsv.sinhVienGioi();
                    break;
                case 4:
                    qlsv.sapXep();
                    qlsv.xuat();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon chuc nang khong hop le!");
                    break;
            }
        }
    }
}


