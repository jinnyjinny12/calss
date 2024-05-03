package com.ohgiraffers.section02.encapsulation.problem;

public class Application01 {

    public static void main(String[] args) {
        Monster drunkTiger = new Monster();
        drunkTiger.name = "드렁큰타이거";
        drunkTiger.hp = -100;

        System.out.println(drunkTiger.name);
        System.out.println(drunkTiger.hp);
        //---직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.


        Monster monster = new Monster();
        monster.name = "주황버섯";
        monster.setHP(-100);
  //      System.out.println(monster.hp); // 지금 몬스터ㅏ 가지고 잇는 hp 를 출력한다.
  //      monster.hp = -100; //-100을 할당하고 다시 출력해봄.
        System.out.println(monster.getHP()); // HP 의 현재값이 나옴.



    }

}
