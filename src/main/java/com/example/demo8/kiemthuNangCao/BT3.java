package com.example.demo8.kiemthuNangCao;


import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BT3 {
    TinhToanService service = new TinhToanService();

    @Test
    public void tinhTich1() {
        assertEquals(42, service.tinhTich(6, 7));
    }

    @Test
    public void tinhTich2() {
        assertEquals(0, service.tinhTich(123, 0));
    }

    @Test
    public void tinhTich3() {
        assertEquals(81, service.tinhTich(9, 9));
    }

    @Test
    public void tinhTich4() {
        assertEquals(0, service.tinhTich(5000, 0));
    }

    @Test
    public void tinhTich5() {
        assertEquals(1000, service.tinhTich(1000, 1));
    }



}
