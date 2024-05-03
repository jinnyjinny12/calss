package com.ohgiraffers.section02.userexception.exception;

public class PriceNegativeException extends NegativeException {

    //생성자가 하나밖에 없음.

    public PriceNegativeException(String message) {
        super(message);
    }
}
