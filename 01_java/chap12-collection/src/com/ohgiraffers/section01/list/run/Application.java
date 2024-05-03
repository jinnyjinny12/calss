package com.ohgiraffers.section01.list.run;


import java.util.*;

public class Application {

    public static void main(String[] args) {

    ArrayList alist = new ArrayList();
    List list = new ArrayList();
    Collection clist = new ArrayList();
    alist.add("a");
    alist.add(123);
    alist.add(new Date());
    System.out.println(alist);

    //list의 길이를 확인할 떄 size 를 이용한다.
     System.out.println(alist.size());
     for (int i= 0; i <alist.size(); i++) {
         //인덱스의 값을 꺼내온다.
         System.out.println(alist.get(i));

     }

     System.out.println("변경테스트");
     String targer =(String) alist.get(0);
     targer = "안ㄴ녕";
     // 특정 인덱스의 값을 추가한다.
     alist.add(0, targer);
     System.out.println(alist.get(0));


     System.out.println();
     System.out.println("삭제 구분");
    //특정 인덱스의 값을 제거한다.
     alist.remove(0);
     for(int i=0;i<alist.size();i++){
         //특정 인덱스의 값을 꺼내온다.
         System.out.println(alist.get(i));
     }


     //값을 수정한다
     alist.set(0,"이것을 수정함");
     for (int i=0;i<alist.size();i++){
         //특정 인덱스의 값을 꺼내온다.
         System.out.println(alist.get(i));
     }

    // List 인터페이스는 String 으로 타입으로 지정한다.
    // List 는 더이상 제네릭 타입이 아니다.
    List<String> stringList = new ArrayList<>();
     stringList.add("안녕");
     stringList.add("10"); // 타입을 String 으로 지정해줬으니 숫자를 그냥 쓰면 오류가 남.

     stringList.add("apple");
     stringList.add("orange");
     stringList.add("mango");
     stringList.add("grape");


     System.out.println();
     System.out.println(stringList);

     Collections.sort(stringList); // Collections 는 자바 컬렉션이다.
        //sort 는 오름차순 정렬이 가능하다.
     System.out.println(stringList);

     System.out.println();
     stringList = new LinkedList<>(stringList);

     /*
     * Iterator란?
     * Collection 인터페이스의 interator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
     * 컬렉션에서 값을 읽어오는 방식을 동일한 방식으로 제공하기 위해 사용한다.
     * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
     * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
     * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
     * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
     * next(): 다음요소를 반환
     *
     *
     * */


     Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

//     while(dIter.hasNext()){
//         System.out.println(dIter.next());
//     }
//
//     System.out.println(dIter.next());

// 배열을 length , 리스트를 size 로 한다.

    List<String> descList = new ArrayList<>();
    while (dIter.hasNext()) {
        descList.add(dIter.next());
    }

    for( int i = 0; i < descList.size(); i++){
        System.out.println(descList.get(i));
    }


    }

}
