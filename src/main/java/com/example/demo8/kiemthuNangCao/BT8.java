package com.example.demo8.kiemthuNangCao;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class BT8 {
    TinhToanService service = new TinhToanService();
    @Test
    public void testTinhTongSoLe1() {
        assertEquals(9, service.tinhTongSoLe(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testTinhTongSoLe2() {
        assertEquals(0, service.tinhTongSoLe(new int[]{2, 4, 6, 8}));
    }

    @Test
    public void testTinhTongSoLe3() {
        assertEquals(0, service.tinhTongSoLe(new int[]{}));
    }

    @Test
    public void testTinhTongSoLe4() {
        assertEquals(25, service.tinhTongSoLe(new int[]{1, 3, 5, 7, 9}));
    }

    @Test
    public void testTinhTongSoLe5() {
        assertEquals(-9, service.tinhTongSoLe(new int[]{-1, -2, -3, -4, -5}));
    }
}
