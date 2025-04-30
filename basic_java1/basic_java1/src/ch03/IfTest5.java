package ch03;

import java.util.Scanner;

public class IfTest5 {

    // 메인함수 (코드의 진입점)
    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요. ( 0~100 )");
        int score = sc.nextInt();
        char grade = 'x';

        // 100 ~ 90 ---> A 학점입니다.
        // 89 ~ 80 ---> B 학점입니다.
        // 79 ~ 70 ---> C 학점입니다.
        // 69 ~ 50 ---> D 학점입니다.
        // 59 이하라면 ---> F 학점입니다.
        // 단, 100 ~ 0 값이 아닌 사용자가 다른 값을 입력했다면
        // 잘못된 입력 입니다. 출력하기

        // 만약 잘못된 값이 들어 왔다면 아래 구문 출력 안할 수 있도록 코드를 수정하시오.


        if (score <= 100 && score >= 90) {
            grade = 'A';
        } else if (score <= 89 && score >= 80) {
            grade = 'B';
        } else if (score <= 79 && score >= 70) {
            grade = 'C';
        } else if (score <= 69 && score >= 50) {
            grade = 'D';
        } else if (score <= 59 && score >= 0) {
            grade = 'F';
        } else if (score > 100 || score < 0) {
            System.out.println("잘못된 입력입니다.");
        }
        if (grade != 'x') {
            System.out.println("당신에 학점은 " + grade + "입니다.");
        }

    } // end of main

} // end of class
