package com.ohgiraffers.section02.library;
// 사람이 책을 빌리고 반납할 수 있게 만들자
// 사용자가 필요한 속성들을 묶어서 관리하기 위해 클래스로 관리함.
// 1. 책이라는 클래스를 만들고
// 2. 책이라는 클래스 안에 책의 속성을 정의한다. (이름, 저자, 번호)
// 3. 사람이라는 클래스를 만들고
// 4. 사람안에 속성을 정의한다. (이름, 멤버쉽 번호, 책 )
//      Book book;
//      String name;//이름
//      int membership; // 회원번호
//    Book book; 책이라는 속성을 갖을 수 있게 만들어줌. 책이라는 객체 타입을 휴먼이 가짐.
//     아직 책이라는 속성이 정해지지 않았기 때문에 = new book 을 쓰지 말기
//     책이 회원번호, 저자 명 등등으로 정확하게 특정되어 있어야 저 연산자를 쓸 수 있음.



public class Human {
    private Book book; // book 은 자료형으로도 쓸 수 있다.
    private String name; //이름
    private int membership; // 회원번호

    // 책의 자료형은 책이다., 사람이라는 클래스는 책이라는 클래스를 가질 수 있다.

    public Book getBook() {
        return book;
    }

    public String getName() {
        return book.name;
    }

    public int getMembership() {
        return membership;
    }



}
