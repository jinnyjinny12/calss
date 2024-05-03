package com.ohgiraffers.section02.variable;

public class Application03 {
    public static void main(String[] args) {
        /*
        *변수 명명 규칙
        * 변수의 이름을 지을 때 아무렇게 짓는 것이 아닌 정해진 규칙이 있다.
        * 실무적으로는 굉장히 중요하기 대문에 반드시 숙지해야 하고,
        * 또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로밍을 하는 첫 단추이다.
         */

        /*
        *변수의 명명 규칙
        * 1. 컴파일 에러를 발생시키는 규칙
        *   1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        *       init inum;
        *       init inum;
        *   1-2. 예약어는 사용이 불가능하다.
        *       int int;
        *       short short;
        *   1-3. 변수명은 대/소문자로 구분한다.
        *   1-4. 변수명은 숫자로 시작할 수 없다.
        *   1-5. 특수한 기호는 '-_'와 '$'만 사용 가능하다.
        *
        * 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙
        *   2-1. 변수명의 길이는 제한이 없다.
        *       int dfdfjldsjafldjf;alkdsjfls;dajfa;sfj;sdfjksdfj;
        *   2-2. 변수명의 합성어로 이루어진 첫 단어는 소문자,두 번째 단어는 대문자로 시작한다(camel-case)
        *       int maxNum;
        *   2-3. 단어와 단어 사이의 연결을 언더스코어로(_) 하지 않는다.
        *   2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다.
        *       int 숫자;
        *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지느지 명확하게 표현하도록 한다.
        *       int minority; 이렇게 쓰면 안됩니다. int 는 정수인데 minority 는 소수거든요.
        *       int point;
        *   2-6. 전형적인 변수 이름이 있다면 가급적으로 사용하다록 한다.
        *   2-7. 명사형으로 작성할 수 있도록 한다.
        *        int increase;
        *   2-8. boolean 형은 의문문으로 가급적이면 긍정형태로 작성한다.
        *
        *

         */
        String name = "서은진";
        int age = 30;
        char gender = 'F';
        System.out.println((name)+(age )+(gender));
        /*
        강사님이 만든 방식
         */

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);


    }
}
