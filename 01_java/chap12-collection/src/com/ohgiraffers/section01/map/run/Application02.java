package com.ohgiraffers.section01.map.run;

import java.io.*;
import java.util.Properties;

public class Application02 {

    public static void main(String[] args) {

        /*
         * Propertise란?
         * HashMap 을 구현하여 사용 방법 거의 유사하지만 key 와 values 모두 문자열만 사용할 수 있는 자료구조이다.
         * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
         *
         * */

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3306/falcon");
        prop.setProperty("user", "falcon");
        prop.setProperty("password", "1234");

        System.out.println(prop);

        try { // 예외가 발생될 수 있는 애들을 묶어줌. 에러가 발생되면 catch 로 감. //FileOutputStream 은 파일을 만드는함수
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver"); // try catch 구문
            prop.store(new FileWriter("driver.text"), "jdbc url");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.text"));
            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        prop2.list(System.out);





    }
}
