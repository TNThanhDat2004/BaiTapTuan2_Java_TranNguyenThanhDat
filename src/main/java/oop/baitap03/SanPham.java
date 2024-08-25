package oop.baitap03;


public class SanPham {
    private String ten;
    private double gia;
   
    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        if (gia < 0) {
            throw new IllegalArgumentException("Gia khong the nho hon 0.");
        }
        this.gia = gia;
    }
    @Override
    public String toString() {
        return "SanPham{" +
                "ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
}
