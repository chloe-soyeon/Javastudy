package org.example;

import java.util.Scanner;

public class Study0410 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int total = s.nextInt();

        int[] answer = new int [num];
        int start = (total/num) - ((num - 1 ) / 2);

        for (int i = 0 ; i < num ; i++) {
            answer[i] = start;
            start++;
        }
        for (int j = 0 ; j < num ; j++) {
            System.out.print(answer[j] + " " );
        }
    }
}
