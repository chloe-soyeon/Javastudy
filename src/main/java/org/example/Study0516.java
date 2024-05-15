package org.example;
class Rabbit10 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + xPos + " / yPos : " + yPos);
        // 교수님 추가 코드
        // 공통코드이므로 집 토끼든, 산 토끼든 출력됨

    }
}

class HouseRabbit extends Rabbit10 { //Rabbit10을 HouseRabbit이 상속한다
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit extends Rabbit10 { //Rabbit10을 MountainRabbit이 상속한다
    String mountain;
    void eatWildgrass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Study0516 {
    public static void main(String[] args){
        HouseRabbit hrabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hrabbit.shape = "삼각형"; //공통 기능(부모에서 선언되어 있었음 => 상속받음)
        hrabbit.owner = "소연"; //고유 기능(상속 받지 않았음)
        hrabbit.move(100,100); //공통 함수(부모에서 선언되어 있었음 => 상속받음)
        hrabbit.eatFeed(); //고유 기능(상속 받지 않았음)

        mRabbit.shape = "네모"; //공통 기능(부모에서 선언되어 있었음 => 상속받음)
        mRabbit.mountain = "설악산"; //고유 기능(상속 받지 않았음)
        mRabbit.move(200,200); //공통 함수(부모에서 선언되어 있었음 => 상속받음)
        mRabbit.eatWildgrass(); //고유 기능(상속 받지 않았음)

    }
}
