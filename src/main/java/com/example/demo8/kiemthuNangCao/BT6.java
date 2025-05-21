package com.example.demo8.kiemthuNangCao;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class BT6 {
    TinhToanService tt = new TinhToanService();
    @Test public void testTimViTri1() {
        assertEquals(2, tt.timViTri(new int[]{1, 2, 3, 4}, 3));
    }
    @Test public void testTimViTri2() {
        assertEquals(-1, tt.timViTri(new int[]{1, 2, 3}, 5));
    }
    @Test
    public void testTimViTri3() {
        assertEquals(0, tt.timViTri(new int[]{10, 20, 30, 40}, 10));
    }

    @Test
    public void testTimViTri4() {
        assertEquals(3, tt.timViTri(new int[]{10, 20, 30, 40}, 40));
    }

    @Test
    public void testTimViTri5() {
        assertEquals(-1, tt.timViTri(new int[]{}, 1));
    }
}
