package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    public void anyTpye(RabbitFarm<?> farm){

        farm.getAnimal().cry();
    }

    //bunny 이거나 그 후손 타입으로 만들어진 토끼농장만 매개변수로 사용이 가능하다.
    public void extendsType(RabbitFarm<?extends Bunny> farm ){
        farm.getAnimal().cry();


    }

    //토끼 농장의 토끼는 bunny이거나 그 부모 타입으로 만들어진 토끼농장만 매개변수로 사용가능

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }


}
