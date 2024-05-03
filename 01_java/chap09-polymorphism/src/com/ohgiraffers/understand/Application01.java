package com.ohgiraffers.understand;

import com.ohgiraffers.understand.auth.inpl.GoogleAuth;
import com.ohgiraffers.understand.auth.inpl.KakaoAuth;
import com.ohgiraffers.understand.auth.inpl.NaverAuth;
import com.ohgiraffers.understand.dto.MemberDTO;
import com.ohgiraffers.understand.service.MemberService;

import java.util.Scanner;

public class Application01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService;
        do{

            MemberDTO memberDTO;
            System.out.println("--------로그인 프로그램 시작------");
            System.out.println("1. google 로그인");
            System.out.println("2. naver 로그인");
            System.out.println("3. kakao 로그인");
            System.out.println("9.프로그램 종료");
            System.out.println("--------로그인 프로그램 w조-료----");

            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("아이디를 입력해주세요: ");
            String id = scanner.nextLine();
            System.out.println("아이디를 입력해주세요: ");
            String pwd = scanner.nextLine();
           memberDTO = new MemberDTO(id, pwd);


            String result = "";

           switch (choice) {
               case 1: memberService = new MemberService(new GoogleAuth());
               result = memberService.loginMember(memberDTO);
               break;

               case 2: memberService = new MemberService(new NaverAuth());
               result = memberService.loginMember(memberDTO);

               case 3: memberService = new MemberService(new KakaoAuth());
               result = memberService.loginMember(memberDTO);

               default: result = "로그인 실패"; break;
           }

           System.out.println(result);

        }while(true);

    }
}
