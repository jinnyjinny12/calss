package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application01 {

    public static void main(String[] args) {
        // Animal 클래스는 Rabbit 의 조상타입으로 타입이 맞지 않음.
        //RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

        //Mammal 클래스는 Rabbit의 부모타입으로 타입이 맞지 않는다.
        //RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();

        //Snake 는 Rabbit 과 관련이 없는 타입으로 타입이 맞지 않는다.
        //RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        //Rabbit 은 Rabbit과 같은 타입으로 제네릭스 타입의 지정이 가능하다
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(new Rabbit());
        farm4.getAnimal().cry();

        //Bunny는 Rabbit 의 자식 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        farm5.getAnimal().cry();

        //DrunkenBunny는 Rabbit 의 증손타입으로 제네릭스 타입 지정이 가능하다.
        RabbitFarm<DrunkenBunny>farm6 = new RabbitFarm<>();
        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();



    }
}
