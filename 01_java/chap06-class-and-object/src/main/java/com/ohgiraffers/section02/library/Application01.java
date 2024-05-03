package com.ohgiraffers.section02.library;

public class Application01 {

    // 메인을 먼저 입력해주기
    public static void main(String[] args){
        Book [] books = new Book[3]; // 배열에다가 속성을 넣어주는 걸 모르겠음.
        // Book 은 사용자가 만든 클래스 [] 배열은 묶음
        // Book[] 클래스의 묶음
        // Book[3] 북이라는 클래스를 3개 가지르 수 잇는 묵음 이 된 거다!
        // books[0].name 북이라는 클래스의 name 이라는 속성에 접근한다.

        books[0].name ="책이름1"; // books[0] 인덱스를 가짐 //books[0].name = "책이름1"
        books[0].author = "작가1";
        books[0].number = 111;


        books[1].name ="책이름2";
        books[1].author = "작가2";
        books[1].number = 222;

        books[2].name ="책이름3";
        books[2].author = "작가3";
        books[2].number = 333;

//        Human song = new Human();
//        song.name = "이름1";
//        song.membership = 1121212;
//        song.book = books[0];


    }



}
