package com.example.demo8.kiemthuNangCao;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BT7 {
    TinhToanService service = new TinhToanService();
    @Test
    public void testTinhTong1() {
        assertEquals(10, service.tinhTong(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testTinhTong2() {
        assertEquals(15, service.tinhTong(new int[]{5, 5, 5}));
    }

    @Test
    public void testTinhTong3() {
        assertEquals(0, service.tinhTong(new int[]{}));
    }

    @Test
    public void testTinhTong4() {
        assertEquals(6, service.tinhTong(new int[]{1, 2, 3}));
    }

    @Test
    public void testTinhTong5() {
        assertEquals(21, service.tinhTong(new int[]{1, 2, 3, 4, 5, 6}));
    }

}
