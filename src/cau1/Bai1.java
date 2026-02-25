package cau1;

import java.util.Scanner;

public class Bai1 {
    public static void check(String input) {
        int nguyenAm = 0;
        int phuAm = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    nguyenAm++;
                } else {
                    phuAm++;
                }
            }
        }

        if (nguyenAm > phuAm) {
            System.out.println("Nguyên âm nhiều hơn (Nguyên âm: " + nguyenAm + ", Phụ âm: " + phuAm + ")");
        } else if (nguyenAm < phuAm) {
            System.out.println("Phụ âm nhiều hơn (Nguyên âm: " + nguyenAm + ", Phụ âm: " + phuAm + ")");
        } else {
            System.out.println("Bằng nhau (Nguyên âm: " + nguyenAm + ", Phụ âm: " + phuAm + ")");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập dãy bạn cần kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        check(input);
    }
}
