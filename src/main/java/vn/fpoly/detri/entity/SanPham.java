package vn.fpoly.detri.entity;

public class SanPham {
   String ma;
   String ten;
   int namBaoHanh;
   float gia;
   int soLuong;
   String danhMuc;

    public SanPham(String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc) {
        this.ma = ma;
        setTen(ten);
        setNamBaoHanh(namBaoHanh);
        setGia(gia);
        setSoLuong(soLuong);
        setDanhMuc(danhMuc);
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten==null||ten.isEmpty()){
            throw new IllegalArgumentException("ten khong hop le");
        }
        this.ten = ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        if (namBaoHanh<= 0){
            throw new IllegalArgumentException("nam bao hanh phai la so duong");
        }
        this.namBaoHanh = namBaoHanh;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        if (gia<=0){
            throw new IllegalArgumentException("gia phai lon hon 0");
        }
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong<=0){
            throw new IllegalArgumentException("so luong phai lon hon 0");
        }
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        if (danhMuc == null || danhMuc.isEmpty()){
            throw new IllegalArgumentException("danh muc khong hop le");
        }
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", namBaoHanh=" + namBaoHanh +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", danhMuc='" + danhMuc + '\'' +
                '}';
    }
}
