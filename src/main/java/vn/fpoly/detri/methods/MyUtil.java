package vn.fpoly.detri.methods;

public class MyUtil {
    public int tongle(int n){
        if (n<1){

            throw new IllegalArgumentException("n phai lon hon 1");
        }
        int tong= 0;
        for (int i = 0; i<= n; i++){
            if (i %2!=0){
                tong += i;
            }
        }
        return tong;
    }
}
