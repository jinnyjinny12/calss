package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comperator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {
        List<BookDTO> bookDTOList =new ArrayList<>();
        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        for(BookDTO bookDTO:bookDTOList){
            System.out.println(bookDTO);

        }

        // 배열은 연속된 자료의 묶음이다. 몇 개의 자료형인지 알 떄 사용한다.
        //

        List testList =new ArrayList();
        testList.add(1);
        testList.add(2);
        testList.add('a');
//        for(Object test: testList){ // 참조자료형의 최상위 타이틀은 오브젝트다
//            System.out.println(test.toString());
//
//        }
        //제네릭 타입 제한에 의해 Comparable 타입이가지고 있는 경우에만 sort가 가능하다.
        //Collections.sort(bookDTOList);


        bookDTOList.sort(new AscendingPrice());
        System.out.println("가격 오름차 순 정렬");
        for(BookDTO book :bookDTOList){
            System.out.println(book);
        }

        //BookDTO sort(new Comparator<BookDTO>){}
        //이따가 깃허브에서 보고 쓰기


    }

}
