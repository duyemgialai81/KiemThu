package com.example.demo8.kiemthuNangCao;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class BT9 {
    TinhToanService service = new TinhToanService();
    @Test
    public void testLaSoNguyenAm1() {
        assertTrue(service.laSoNguyenAm(-1));
    }
    @Test
    public void testLaSoNguyenAm2() {
        // Số âm lớn hơn -1 (ví dụ -100)
        assertTrue(service.laSoNguyenAm(-100));
    }

    @Test
    public void testLaSoNguyenAm3() {
        assertTrue(service.laSoNguyenAm(-3));
    }

    @Test
    public void testLaSoNguyenAm4() {
        assertTrue(service.laSoNguyenAm(-10));
    }

    @Test
    public void testLaSoNguyenAm5() {
        assertTrue(service.laSoNguyenAm(-9999));
    }
}
