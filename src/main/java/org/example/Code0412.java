package org.example;

import java.util.Scanner;
// Scanner 클래스를 사용하기 위해 경로를 호출
public class Code0412 {
    // Code0412이란 클래스를 생성하며, public을 붙여 외부에서 자유롭게 접근가능하게 함
    public static void main(String[] args) {
        //자바 실행 시 제일 먼저 동작하고 어느 객체에서든 접근가능하며
        //자바가 컴파일 되는 순간 정의되는 돌려주는 값이 없는 함수
        Scanner s = new Scanner(System.in);
        //Scanner 객체를 생성하며, 화면에서 값을 입력받음

        int a = s.nextInt();
        // 첫번째 정수 타입 변수를 입력받기 위해 선언
        int b = s.nextInt();
        // 두번째 정수 타입 변수를 입력받기 위해 선언
        int sum = 0;
        // 합계를 구하기 위한 정수 타입을 전역 변수로 선언

        for (int i = a ; i <= b ; i++) {
            // 첫번째로 입력 받은 값을 초기값으로 설정하며, 이는 지역 변수로 선언
            // 조건식은 두번째로 입력 받은 값까지 포함하여 작을 때, 실행
            // 이후 i 값을 1씩 증가시킴

            if ( i%2 == 1 ) {
                //홀수의 합계를 구하기 위해, 2로 나누었을 때 나머지가 1인 i값을 받아옴
                sum += i;
                //위에서 전역 변수로 선언한 sum에 홀수 i 값을 누적하여 담음
            }
        }
        System.out.println(a + "부터 " + b + "까지 홀수의 합계는 " + sum + "입니다." );
        // 첫번째 입력받은 값부터 두번째 입력받은 값까지의 홀수의 합계를 출력함
    }
}
