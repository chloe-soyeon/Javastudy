package org.example;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;



public class Insertsort {

    // 삽입 정렬
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int[] array = new int[] {2,4,9,6,14};

            // 배열로 구현
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j > 0; j--) {

                    if(array[j-1] > array[j]) {
                        int temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}
