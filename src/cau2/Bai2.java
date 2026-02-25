package cau2;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void check(int[] arr) {
    int max = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
    for (int x : arr) {
        if (x > max) {
            second = max;
            max = x;
        } else if (x < max && x > second) {
            second = x;
        }
    }

    if (second == Integer.MIN_VALUE) {
        System.out.println("không tồn tại số lớn thứ nhì");
    } else {
        System.out.println("max: " + max + ", Second: " + second);
    }
}
    public static void main(String[] args) {
       int[] arr = {10, 5, 8, 12, 3};
       int[] arr1 = {20, 10, 20, 5};
       int[] arr2 = {5, 5, 5};
       check(arr);
        check(arr1);
        check(arr2);
    }
}

