package cau2;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số n phần tử: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(31) + 10;
        }
        System.out.println("Mảng được sinh tự động:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int index, element;
        System.out.println("Mời bạn nhập ví trí muốn cập nhật: ");
        index = sc.nextInt();
        if(index < 0 || index >= arr.length){
            System.out.println("Ví trị không hợp lệ!");
            return;
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        System.out.println();
        System.out.println("nhập phần tử bạn muốn chèn: ");
        element = sc.nextInt();
        arr[index] = element;

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

