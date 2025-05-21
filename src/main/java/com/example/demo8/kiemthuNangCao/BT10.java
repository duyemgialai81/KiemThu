package com.example.demo8.kiemthuNangCao;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class BT10 {
    TinhToanService service = new TinhToanService();
    @Test
    public void testAllPositive() {
        int[] input = {1, 2, 3, 4, 5};
        boolean[] expected = {false, false, false, false, false};
        assertArrayEquals(expected, service.kiemTraSoAm(input));
    }

    @Test
    public void testAllNegative() {
        int[] input = {-1, -2, -3, -4, -5};
        boolean[] expected = {true, true, true, true, true};
        assertArrayEquals(expected, service.kiemTraSoAm(input));
    }
    @Test
    public void testMixed() {
        int[] input = {-1, 0, 2, -3, 5};
        boolean[] expected = {true, false, false, true, false};
        assertArrayEquals(expected, service.kiemTraSoAm(input));
    }
    @Test
    public void testEmpty() {
        int[] input = {};
        boolean[] expected = {};
        assertArrayEquals(expected, service.kiemTraSoAm(input));
    }
    @Test
    public void testZeros() {
        int[] input = {0, 0, 0};
        boolean[] expected = {false, false, false};
        assertArrayEquals(expected, service.kiemTraSoAm(input));
    }
}
