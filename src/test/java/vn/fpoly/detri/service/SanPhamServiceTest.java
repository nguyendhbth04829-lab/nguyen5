package vn.fpoly.detri.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vn.fpoly.detri.entity.SanPham;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
SanPhamService sanPhamService;
    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    @DisplayName("luong chinh add")
    void addSanPhamWithValid(){
        SanPham sanPham = new SanPham("sp1","Sua",2026,1000000,99,"Gia dung");
        sanPhamService.addSanPham(sanPham);
        assertEquals(1,sanPhamService.getAll().size());
        assertEquals("sp1",sanPhamService.getById("sp1").getMa());
    }

    @Test
    @DisplayName("luong chinh update")
    void updateSanPhamWithValid(){
        SanPham sanPham = new SanPham("sp1","Hoa",2020,50000,4,"Hoa la");
        sanPhamService.addSanPham(sanPham);
        sanPham.setTen("Cay");
        sanPhamService.update(sanPham);
        assertEquals("Cay",sanPhamService.getById("sp1").getTen());
    }

    @Test
    void updateSanPhamWithInValidName(){
        SanPham sanPham = new SanPham("sp2","Ho",2021,60000,1,"Ko");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.update(new SanPham("sp2","",2021,60000,1,"Ko")));
        assertEquals("ten khong hop le",exception.getMessage());
    }

    @Test
    void updateSanPhamWithNull(){
        SanPham sanPham = new SanPham("sp3","Hm",2024,50000,3,"Khong");
        sanPhamService.addSanPham(sanPham);
        Exception exception=assertThrows(IllegalArgumentException.class,()->sanPhamService.update(new SanPham(null,"Hm",2024,50000,3,"Khong")));
        assertEquals("san pham khong ton tai",exception.getMessage());
    }

    @Test
    void updateSanPhamWithInValidNamBaoHanh(){
        SanPham sanPham=new SanPham("sp4","Mo",2020,50000,5,"MLo");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.update(new SanPham("sp4","Mo",-1,50000,5,"MLo")));
        assertEquals("nam bao hanh phai la so duong",exception.getMessage());


    }

    @Test
    void updateSanPhamWithInValidGia(){
        SanPham sanPham = new SanPham("sp5","Mo",2019,40000,4,"Lo");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class, ()->sanPhamService.update(new SanPham("sp5","Mo",2020,0,4,"Lo")));
        assertEquals("gia phai lon hon 0",exception.getMessage());
    }

    @Test
    void updateSanPhamWithInValidSoLuong(){
        SanPham sanPham=new SanPham("sp6","Ma",2024,10000,6,"Lo");
        sanPhamService.addSanPham(sanPham);
        Exception exception= assertThrows(IllegalArgumentException.class,()->sanPhamService.update(new SanPham("sp6","Ma",2020,1,0,"L")));
        assertEquals("so luong phai lon hon 0",exception.getMessage());
    }

    @Test
    void updateSanPhamWithInValidDanhMuc(){
        SanPham sanPham= new SanPham("sp7","Mk",2023,1,8,"K");
        sanPhamService.addSanPham(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class,()->sanPhamService.update(new SanPham("sp7","m",2026,5,99,null)));
        assertEquals("danh muc khong hop le",exception.getMessage());
    }


}