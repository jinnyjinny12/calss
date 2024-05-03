package com.ohgiraffers.phone.controller;

//비즈니스 로직을 담당하는 클래스로,
//전화번호부 관련된 기능을 처리하고 있습니다.
//전화번호부 조회, 수정, 삭제 등등을 하는 함수들이 모여있는 클래스!!!

import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phone.service.PhoneService;
import java.util.ArrayList;


public class PhoneController {
    // 어플리케이션 > 컨트롤러>서비스>레파지토리

    //PhoneController클래스 내에서만 사용되고 변경되지 않는 phoneservice 의 객체를 생성하고
    //이를 phoneService 변수에 할당하는 것을 의미한다.
    // PhoneController 에서 PhoneService 를 사용할 수 있으면서도 다른 부분에서 변경으로 인해 예기치 않은 동작을 방지할 수 있다.

    private final PhoneService phoneService = new PhoneService(); //

    public String number(PhoneDTO[] numbers){
        for (PhoneDTO phoneDTO : numbers) {
            if(phoneDTO.getName().equals("")){ // 동명이인은?
                return "이름을 정확하게 입력해주세요!";
            }

            if(phoneDTO.getName().equals("")){ // 동명이인은?
                return "번호를 정확하게 입력해주세요! 예시) 010-1234-1234 ";
            }

            if(phoneDTO.getName().equals("")){ // 동명이인은?
                return "주소를 정확하게 입력해주세요! 예시) 서초구 서초동";
            }

        }
        String result = phoneService.number(numbers);
        return result;
    }

    public String numberModify(){

        return "번호 수정";
    }

    public String numberDelete(int no){
        String result = phoneService.numberDelete(no);

        return result;
    }

    public String numberDetailRead(String name){
//        if(no<0){
//            return "조회할 번호를 잘못 입력하셨습니다.";
//        }
        if(name.equals("")){ // 동명이인은?
            return "다시 이름을 정확하게 입력해주세요";
        }
        PhoneDTO phoneDTO = phoneService.numberDetailRead(name);
        if(phoneDTO == null){
            return "존재하지 않는 이름입니다.";
       }

        return phoneDTO.toString();
    }

    public String numberAllRead(){
        ArrayList numberlist = phoneService.numberAllRead();
        String result = " 주문목록 : " + numberlist.toString();

        return result;
    }




}
