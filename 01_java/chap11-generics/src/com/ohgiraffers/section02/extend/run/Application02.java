package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {

    public static void main(String[] args) {

        /*
        * 와일드카드(WildCard)
        * 제네릭스 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        * 그 객체 타입의 변수를 제한할 수 있다.
        * <?> : 제한없음
        * <? extends Type> : 와일드카드의 상한 제한 (type과 Type의 후손을 이용해서 생성한 인스턴스만 인자로 사용가능)*
        * <? supper Type> : 와일드 카드 하한 제한( Type 과 Type의 부모를 이용해 생생한 인스턴스 인자로 사용가능)
        * <
        *
        *
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();
        //농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
        // AnyType의 조건은 없다. 하지만 RabbitFarm 의 조건은 <T extends RbbitFarm을 생성할 수 없다는 문제가 있다
        //wildCardFarm.anyTpye(new RabbitFarm<Mammal>(new mammal()));
        //wildCardFarm.anyTpye(new RabbitFarm<Reptile>(new Rabbit()));
        //그래서 아래와 같이 RabbitFarm 의 생성 조건을 만족한다면 anyTpye의 조건을 만족하게 되는 것이다

        wildCardFarm.anyTpye(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyTpye(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyTpye(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        //RabbitFarm을 생성하는 부분에는 문제가 없다. 그러나 extendsType의 매개변수 조건을 확인하면 <? extends Bunny>가 있으며
        //이것으로 아래의 Rabbit은 매개변수 조건을 위배하게 된다.
        //wildCardFarm.extendsType((new RabbitFarm<Rabbit>(new Rabbit())));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        //RabbitFarm 의 기준을 벗어남 //Rabbit 자식들만 만들 수 있음
        //wildCardFarm.superType(new RabbitFarm<Animal>(new Bunny()));

        //super 타입 조건은 버니부터 에니몰까지 레빗 팜은 래빗 아래까지마 그래서 오류남
        //RabbitFarm 의 조건은 만족하지만, super 타입의 조건은 만족하지 않는다.
        //superType의 매개변수 조건은 bunny의 조상만 허용하기 때문이다.
        //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
