package com.ohgiraffers.section02.encapsulation.problem;

public class Monster { //name, hp, sethp 라는 세 개의 매서드가 있음.
    String name;
    int hp;
  //  int hp; // private int 은닉 -> 캡슐화 원칙

    //monster 의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함.

    // 얘는 void 여서 리턴을 해줄 필요가 없음. 자기가 가지고 있기 때문에 굳이 리턴을 안해줘도 됨.
    public void setHP(int hp){ //setHp시작, 이 메서드를 호출하면 항상 정수인 매개변수가 필요함
     if(hp>0) {
         this.hp = hp; // int hp 인지 setHP(int hp) 인지 확인이 안됨. -> this 를 써줌
         // this는 나 자신을 말함. 예약어이다. 클래스형 자료형은 나를 지칭할 수 있음. 클래서 내부에서 나를 호출할 때 this 를 씀.
     }else{
         System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");

     }

    }//setHp 종료

    public int getHP(){
        return this.hp;

    }


}

// 필드의 직접적인 엑세스를 막는 걸 캡슐화라고 함 -> private를 통해 할 수 있음.