package com.example.demo8.kiemthuNangCao;

public class TinhToanService {
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static int tinhThuong(int a, int b) {
        if (b == 0) throw new ArithmeticException("không được chia cho 0");
        return a / b;
    }
    public double tinhTrungBinhCong(int a, int b) {
        return (a + b) / 2.0;
    }
    public int timViTri(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static int tinhTong(int[] numbers) {
        int tong = 0;
        for (int n : numbers) {
            tong += n;
        }
        return tong;
    }
    public static int tinhTongSoLe(int[] numbers) {
        int tong = 0;
        for (int n : numbers) {
            if (n % 2 != 0) {
                tong += n;
            }
        }
        return tong;
    }
    public static boolean laSoNguyenAm(int number) {
        return number < 0;
    }
    public static boolean[] kiemTraSoAm(int[] numbers) {
        boolean[] ketQua = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ketQua[i] = numbers[i] < 0;
        }
        return ketQua;
    }

}
