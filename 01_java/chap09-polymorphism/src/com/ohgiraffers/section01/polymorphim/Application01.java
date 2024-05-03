package com.ohgiraffers.section01.polymorphim;

public class Application01 {

    public static void main(String[] args) {

        /*
        *다형성
         *  다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
         *  그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
         *  하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
         *
         * 필기.
         *  다형성은 객체지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며,
         *  객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
         *  하지만 학습하기 어렵다는 단점을 가지고 있다.
        * */

        /* 필기.
         *  다형성의 장점
         *  1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         *  2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         *     이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         *     (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
         *     하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         *     다형성을 이해하기 쉬운 가장 좋은 예이기도 하다.
         *     하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         *  3. 확장성이 좋은 코드를 작성할 수 있다.
         *  4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         *
         * */

        Rabbit rabbit = new Rabbit();
        rabbit.cry();
        rabbit.eat();
        rabbit.run();
        rabbit.jump();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        Animal animal = rabbit; // 자식은 부모의 기능을 상속받을 수 있다.부모를 자식에 넣을 수는 있지만 자식을 부모에 넣을 수는 없다.
        animal.cry();
        animal.eat();
        animal.run();

        Rabbit rabbit1 = (Rabbit)animal;
        rabbit1.jump();
        rabbit1.cry();

        System.out.println("-----검증 --------");
        Animal ai = new Rabbit(); // 에니몰의 함수를 레빗에 넣음. 다운캐스팅(애니몰3,레빗4)
        Animal ai2 = new Animal();

//        Rabbit ra2 = (Rabbit)ai2;
//        Rabbit ra = (Rabbit) new Animal(); // 왜 안돼지? 애니멀을 만들고서 래빗에 넣으려고 햇더니 에러가 남.


        Animal[] animals = new Animal[5]; //애니몰에 래빗, 타이거 할당함.
        animals[0] = new Rabbit(); // 레빗에 입력된 함수가 출력됨 : 재정의 된다는 의미로 오버라이드된다는 뜻.
        animals[1] = new Tiger(); // 이런 묶음을 출력하려면 원래 각 클래스에 있는 함수를 하나하나다 써줘야 하지만, 아래와 같은 포문과 이프문을 통해서 한 번에 써줄 수 있음.
        animals[2] = new Rabbit();
        animals[3] = new Rabbit();
        animals[4] = new Tiger();

        for (Animal a: animals){
            System.out.println("시작~~~~~");
            a.run();
            a.eat();
            a.cry();
            if(a instanceof Tiger){
                ((Tiger) a).bite();
            }else if(a instanceof Rabbit){
                ((Rabbit) a).jump();
            }

            System.out.println("종료~~~~");
        }

    }

}
