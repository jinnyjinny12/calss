package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {

    public static void main(String[] args) {

        /*
        *
        * 단일 연결 리스트
        * : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소 사이클 링크로 연결하여 구성하며
        * 마치 연결된 리스트 형태인 것처럼 만든 자료구조다.
        * 요소의 저장과 삭제시 다음 요소를 가리키는 참조링크만 변경하면 되기 때문에
        * 요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayList보다 성능면에서 우수하다.
        * 하지만 단일 연결 리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근하기가 어렵다.
        * 이를 보완하고자 만든 것이 이중 연결 리스트이다.
        *
        *
        * 이중 연결 리스트
        * 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
        * 이전 요소로 접근하기 쉽게 고안된 자료구조다.
        *
        * listkedList 는 이중 연결 리스트를 구현하는 것이라 역시 list 인터페이스를 상속받아서
        * ArrayList 와 사용하는 방법 거의 유사하다.
        * 하지만 내부적으로 요소를 저장하는 방법에 차이가 없는 것이다.
        * 각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이 좋다.
        *
        *
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0)); // 얘 왜이러지?

        linkedList.remove(0);
        System.out.println(linkedList);

        linkedList.set(0,"안녕"); //list 에 있는 0을 안녕으로 세팅한다.
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());
        linkedList.clear();
        System.out.println(linkedList.isEmpty());


    }

}
