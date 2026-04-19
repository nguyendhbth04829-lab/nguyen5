package vn.fpoly.detri.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {
    MyUtil myUtil = new MyUtil();
    @Test
    void tongLe(){
        Assertions.assertEquals(16,myUtil.tongle(7));
    }
}
