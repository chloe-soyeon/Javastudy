package org.example;
class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    Rabbit3(String value) { //생성자를 사용하여 다양한 토끼의 모양을 만들기
        this.shape = value;
    }
    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
        //this를 써서 가독성을 높임.
    }
}
public class Rabbit_ex {
    public static void main(String[] args) {
        String rabbitColor = "파란색";

        Rabbit3 rabbit = new Rabbit3(rabbitColor);
        System.out.println("rabbit color : " + rabbit.shape);

    }
}
