package ch03;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번쨰 조건이 결과를 결정할 경우
 * 두 번째 조건을 평가하지 않는것
 */
public class Operation8 {

    // 메인 함수 (코드의 진입점)
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리 합 (||) 에서 빠른 평가가 되는 식을 만들어 보자.
        // 빠른 평가란?
        // 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우, 두 번째 조건을 평가하지 않는다.!!
        // 논리 합 --> 첫 번째 조건이 true 라면 두 번째, 세 번째 확인 안한다.

        //                   10  >= 10
        boolean result = ((number += 5) >= 10) || ((index += 2) > 0);
        System.out.println("result1 : " + result);

        System.out.println("number : " + number);
        System.out.println("index : " + index);

    } // end of main

} // end of class
