package com.example.demo8.kiemthuNangCao;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.testng.Assert.assertThrows;

public class BT4 {
    TinhToanService service = new TinhToanService();

    @Test
    public void tinhThuong1() {
        assertEquals(3, service.tinhThuong(9, 3));
    }

    @Test
    public void tinhThuong2() {
        assertEquals(1, service.tinhThuong(4, 3));
    }

    @Test
    public void tinhThuong3() {
        assertEquals(8, service.tinhThuong(8, 1));
    }

    @Test
    public void tinhThuong4() {
        assertEquals(0, service.tinhThuong(0, 5));
    }

    @Test
    public void tinhThuong5() {
        assertEquals(2, service.tinhThuong(10, 5));
    }

}
