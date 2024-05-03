package com.ohgiraffers.phone.dao;

// Repository 영역은 DB 와 상호작용을 담당하는 곳
// 데이터베이스와 주로 CRUD(create, read, update, delete) 작업을 수행함
// 데이터베이스의 통신을 추상화하여 서비스나 컨트롤러 등에서 데이터에 접근할 수 있도록 함.
// 1. 데이터 엑세스 로직 구현
// 2. 데이터 베이스 연결 관리
// 3. 데이터 변환
// 4. 데이터 영속성 관리
// 5. 캐싱 ?
//


import com.ohgiraffers.phone.dto.PhoneDTO;
import com.ohgiraffers.phoneDB.PhoneDB;
import java.util.ArrayList;



public class PhoneRepository {
    private final PhoneDB phoneDB = PhoneDB.getInstance();

    public String number (PhoneDTO [] numbers){
        int oldNUm =phoneDB.getNumbers().size();

        for (PhoneDTO phoneDTO : numbers) {
            phoneDB.setItem(phoneDTO);
        }

        if (oldNUm >=phoneDB.getNumbers().size()) {
            return "등록실패";
        }
        return "등록성공";
    }

    public String numberModify(){
        return "수정 성공";
    }

    public String numberDelete(int no){
        int oldSize = phoneDB.getNumbers().size();
        phoneDB.getNumbers().remove(no);

        if(phoneDB.getNumbers().size() >= oldSize){
            return "번호 삭제가 실패했습니다";
        }

        return "번호가 삭제되었습니다." ;
    }

    public PhoneDTO numberDetailRead(String name){
        if (name  == null) {
            System.out.println("전화번호부가 비어 있습니다.");
            return null; // 혹은 적절한 값 또는 예외를 반환할 수 있습니다.
        }

        for (int i = 0; i < phoneDB.getNumbers().size(); i++) {
            PhoneDTO number = (PhoneDTO) phoneDB.getNumbers().get(i);
           if (name.equals(number.getName())){
               return number;
           }
        }
        return null;

//        PhoneDTO number = (PhoneDTO) phoneDB.getNumbers().get(no);
//        return number;

    }
    public ArrayList numberAllRead(){
        return phoneDB.getNumbers(); //numbers 라는 배열에 내가 입력한 값들이 저장되어 있음!
    }


}
