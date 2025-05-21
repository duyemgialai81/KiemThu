package com.example.demo8.kiemthuNangCao;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BT2 {
    TinhToanService service = new TinhToanService();

    @Test
    public void tinhHieu1() {
        assertEquals(-1, service.tinhHieu(4, 5));
    }

    @Test
    public void tinhHieu2() {
        assertEquals(2, service.tinhHieu(7, 5));
    }

    @Test
    public void tinhHieu3() {
        assertEquals(48, service.tinhHieu(50, 2));
    }

    @Test
    public void tinhHieu4() {
        assertEquals(47, service.tinhHieu(50, 3));
    }

    @Test
    public void tinhHieu5() {
        assertEquals(81, service.tinhHieu(90, 9));
    }

}
