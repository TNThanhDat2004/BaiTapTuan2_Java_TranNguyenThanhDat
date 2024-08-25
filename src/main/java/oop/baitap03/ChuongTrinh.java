package oop.baitap03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChuongTrinh {

    public static ArrayList<SanPham> ds = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int luaChon;

            do {
                System.out.println("\n--- MENU QUAN LY SAN PHAM ---");
                System.out.println("1. Nhap danh sach san pham");
                System.out.println("2. Sap xep san pham theo gia va xuat ra man hinh");
                System.out.println("3. Tim va xoa san pham theo ten");
                System.out.println("4. Xuat gia trung binh theo gia san pham");
                System.out.println("0. Thoat");
                System.out.print("Nhap lua chon cua ban: ");
                luaChon = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline còn lại

                switch (luaChon) {
                    case 1:
                        nhap(scanner);
                        break;
                    case 2:
                        sapXep();
                        xuat();
                        break;
                    case 3:
                        xoa(scanner);
                        break;
                    case 4:
                        xuatGiaTrungBinh();
                        break;
                    case 0:
                        System.out.println("Chuong trinh ket thuc.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le, vui long chon lai.");
                        break;
                }
            } while (luaChon != 0);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    private static void nhap(Scanner sc) {
        String chon;
        do {
            System.out.println("Nhap thong tin san pham:");
            System.out.print("Ten: ");
            String ten = sc.nextLine();
            double gia = 0;
            boolean validGia = false;

            while (!validGia) {
                System.out.print("Gia: ");
                try {
                    gia = Double.parseDouble(sc.nextLine());
                    validGia = true;
                } catch (NumberFormatException e) {
                    System.out.println("Gia phai la mot so. Vui long nhap lai.");
                }
            }

            ds.add(new SanPham(ten, gia));

            System.out.print("Tiep tuc (Y/N)? ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

    private static void xuat() {
        System.out.println("\nDanh sach san pham:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }

    private static void sapXep() {
        Collections.sort(ds, (sp1, sp2) -> Double.compare(sp2.getGia(), sp1.getGia()));
        System.out.println("Sap xep san pham theo gia thanh cong.");
    }

    private static void xoa(Scanner sc) {
        System.out.print("Nhap ten san pham can xoa: ");
        String ten = sc.nextLine();

        boolean timThay = ds.removeIf(sp -> sp.getTen().equalsIgnoreCase(ten));

        if (timThay) {
            System.out.println("Xoa san pham thanh cong.");
        } else {
            System.out.println("Khong tim thay san pham theo ten: " + ten);
        }
    }

    private static void xuatGiaTrungBinh() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach san pham trong.");
            return;
        }

        double tongGia = ds.stream().mapToDouble(SanPham::getGia).sum();
        double giaTrungBinh = tongGia / ds.size();
        System.out.println("Gia trung binh cua cac san pham la: " + giaTrungBinh);
    }
}
