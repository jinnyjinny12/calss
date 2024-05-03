package com.ohgiraffers.section02.demensinal;

public class Practice {
        public static void main(String[] args) {

            // 바둑판 만들기
            // 1)가로 19, 세로 19 배열이 있는 바둑판을 만들자 : 배열함수 new int [][]
            // 2) 바둑판 초기화 : 빈 공간은 ". "
            //
            // 컴퓨터가 내가 입력한 바둑을 읽고 이에 맞춰서 컴퓨터가 바둑을 놓을 수 있는 바둑판




            // 배열함수를 선언해서 19*19를 가진 배열함수, 바둑판을 만듬.
            int[][] board = new int[19][19];

            // 바둑판을 초기화하거나 그리는 코드 추가 가능
            //


            // 바둑판 출력 // 배열의 초기화값은 0이다.
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    System.out.print(board[i][j] + "+");
                }
                System.out.println(); // 한 행 출력 후 줄 바꿈
            }
        }
    }



