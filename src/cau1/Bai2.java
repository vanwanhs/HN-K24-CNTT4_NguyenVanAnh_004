package cau1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String fullName = sc.nextLine();
        fullName = fullName.trim().toLowerCase();
        String[] words = fullName.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            result.append(firstChar).append(rest).append(" ");
        }
        String firstName = words[words.length - 1];
        StringBuilder username = new StringBuilder();
        username.append(Character.toUpperCase(firstName.charAt(0)))
                .append(firstName.substring(1));

        for (int i = 0; i < words.length - 1; i++) {
            username.append(Character.toUpperCase(words[i].charAt(0)));
        }
        System.out.println("Tên chuẩn: " + result.toString().trim());
        System.out.println("Username: " + username);
    }
}