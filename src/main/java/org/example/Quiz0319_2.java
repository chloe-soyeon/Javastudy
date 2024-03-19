package org.example;

public class Quiz0319_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            if (i <= 4) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if (i > 4) {
                for (int j = 1; j <= 8 - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

