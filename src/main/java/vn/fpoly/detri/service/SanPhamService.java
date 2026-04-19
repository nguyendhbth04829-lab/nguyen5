package vn.fpoly.detri.service;

import vn.fpoly.detri.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

List<SanPham> sanPhams = new ArrayList<>();
public void addSanPham(SanPham sanPham){
   if (sanPham == null){
       throw new IllegalArgumentException("san pham khong the null");
   }
   sanPhams.add(sanPham);
}
public void update(SanPham sanPham){
if (sanPham==null){
    throw new IllegalArgumentException("san pham khong the null");
}
for (int i = 0; i<sanPhams.size();++i){
    if (sanPhams.get(i).getMa()==sanPham.getMa()){
        sanPhams.set(i,sanPham);
    }else {
        throw new IllegalArgumentException("san pham khong ton tai");
    }
}


}
public SanPham getById(String id){
    for (SanPham sanPham:sanPhams){
        if (sanPham.getMa()==id){
            return sanPham;
        }
    }
    return null;
}
public List<SanPham> getAll(){
    return sanPhams;
}
}
