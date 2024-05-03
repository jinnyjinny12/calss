package com.ohgiraffers.section02.baduk;

import java.util.Scanner;

public class Baduk {

    public static void main(String[] args) {
        Baduk b = new Baduk();
        b.baduk();

    }


    public void baduk() {
        String[][] borad = new String[19][19];

        for (int i = 0; i < borad.length; i++) {
            for (int j = 0; j < borad[0].length; j++) {
                borad[i][j] = "[ ]";
                System.out.print(borad[i][j]);
            }
            System.out.println();
        }
    }
}