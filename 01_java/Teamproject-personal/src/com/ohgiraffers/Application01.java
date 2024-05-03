package com.ohgiraffers;

import com.ohgiraffers.phone.controller.PhoneController;
import com.ohgiraffers.phone.dto.PhoneDTO;
import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//사용자의 정보를 입력받는다.
        PhoneController phoneController = new PhoneController();
        boolean choice = true;
        String result = "";



        while(choice){
            System.out.println("========실행할 번호를 입력하세요^_^========= ");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 상세 조회");
            System.out.println("5. 전화번호 전체 조회");
            System.out.print("어떤 메뉴을 실행시키겟습니까?");
            int input = sc.nextInt(); // 스위치 함수가 실행되는 변수를 input 으로 받는다.
            sc.nextLine();


            switch (input){

                case 1: // 전화번호 등록

                    System.out.print("전화번호 등록을 몇 번 하시겠어요? :" );
                    int cnt =  sc.nextInt();
                    sc.nextLine();
                    PhoneDTO[] numbers = new PhoneDTO[cnt];
                    for(int i = 0; i < numbers.length; i++){

                        System.out.println( "등록할 사람의 이름을 입력하세요. ");
                        String name = sc.nextLine();

                        System.out.println( "등록할 사람의 번호를 입력하세요. 예시) 010-1234-1234");
                        String number = sc.nextLine();

                        System.out.println( "등록할 사람의 주소를 입력하세요. 예시) 서초구 서초동");
                        String address = sc.nextLine();

                        numbers[i] = new PhoneDTO(name, number, address);
                        //


                    }

                    result = phoneController.number(numbers);
                    break;

                case 2: // 전화번호 수정
                    phoneController.numberModify();

                    break;
                case 3: // 전화번호 삭제
                    System.out.println("삭제할 전화번호의 번호를 입력해주세요!");
                    int no = Integer.parseInt(sc.nextLine());
                    result = no + "번";
                    result += phoneController.numberDelete(no);
                    break;
                case 4: // 전화번호 상세

                        System.out.println(phoneController.numberAllRead());
                        System.out.println("상세조회할 이름를 입력하세요");
                        String name = sc.nextLine();
                        result = phoneController.numberDetailRead(name);



//                    System.out.println("상세조회할 번호를 입력하세요");
//                    int num = sc.nextInt();
//                    sc.nextLine();
 //                   result = phoneController.numberDetailRead(num);
                    break;

                case 5: //전화번호 전체 조회
                    phoneController.numberAllRead();
                    break;
                default: // 입력오류
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);
            System.out.print("주문을 계속하시겠나요?");
            choice = sc.nextBoolean();

        }




    }

}
