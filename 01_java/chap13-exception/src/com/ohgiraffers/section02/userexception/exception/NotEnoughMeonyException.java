package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMeonyException extends Exception{

    public NotEnoughMeonyException() {
    //Exception은 최상위 부모 타입이다.
    //
    }

    public NotEnoughMeonyException(String message) {
        super(message);
    }


}
