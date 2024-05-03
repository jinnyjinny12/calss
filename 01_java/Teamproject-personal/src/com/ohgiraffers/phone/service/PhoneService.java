package com.ohgiraffers.phone.service;


import com.ohgiraffers.phone.dao.PhoneRepository;
import com.ohgiraffers.phone.dto.PhoneDTO;
import java.util.ArrayList;

public class PhoneService {
    // 비즈니스 로직을 처리하는 클래스
    // 1) 비즈니스 로직을 수행
    // 2) 데이터 엑세스 관리
    // 3) 비즈니스 규칙을 적용
    // 4) 오류 처리

    private final PhoneRepository phoneRepository = new PhoneRepository();

    public String number(PhoneDTO[] numbers){//출력하고 싶은거_등록완료(문자열_

        for(PhoneDTO number : numbers){
            if(number.getNumber().length()!=13) {
                return "번호를 다시 입력하세요";

            }
        }
        String result = phoneRepository.number(numbers);
        return result;
    }

    public String numberModify(){//출력하고 싶은 거 _ 수정완료 또는 수정이 완료된 PhoneDTO?

        return "";
    }

    public String numberDelete(int no){  //삭제하고 싶은 거 삭제완료 문자열
        // 삭제가 완료되고 나서 작업성공여부를 나타내기 위해 문자열로 출력되기 때문에
        // String 을 반환한다.

        String result = phoneRepository.numberDelete(no);
        return result;
    }

    public PhoneDTO numberDetailRead(String name){// 출력하고 싶은 거 : 조회한 phoneDTO!
        // phoneDTO 객체에 담아서 반환되기 때문에 PhoneDTO 객체를 반환함.

        PhoneDTO order = phoneRepository.numberDetailRead(name);
        return order;
    }

    public ArrayList numberAllRead(){ // 출력하고 싶은 거 : 다수의 객체 번호리스트 전부
        // ArrayList 는 다수의 객체를 담고자 할 때 사용된다. 전화번호 목록을 출력하는 numberAllRead 메서드는
        // ArrayList 형태로 반환됩니다.


        ArrayList numberlist = phoneRepository.numberAllRead();

        return numberlist;
    }


}
