package com.ohgiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit>{ // T는 제네릭스

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;

    }


    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
