package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code0626 {
    public static void main(String[] args) {
        // 입력값을 저장할 ArrayList 생성
        List<Integer> q2 = new ArrayList<>();

        // 숫자 추가
        q2.add(5);
        q2.add(3);
        q2.add(6);
        q2.add(1);
        q2.add(2);
        q2.add(4);

        // 오름차순 정렬
        Collections.sort(q2);

        // 람다식을 이용하여 출력
        q2.forEach(number -> System.out.print(number + " "));
    }
}
