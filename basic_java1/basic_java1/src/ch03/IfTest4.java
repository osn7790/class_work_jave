package ch03;

import java.util.Scanner;

public class IfTest4 {

    // 메인함수 (코드의 진입점)
    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요. ");
        int score = sc.nextInt(); // 키보드 정수 값을 받을 수 있는 명령문
        System.out.println("score : " + score);

        // 조건문을 완성 하세요
        // 90점 이상 -> A학점 입니다.
        // 80점 이상 -> B학점 입니다.
        // 70점 이상 -> C학점 입니다.
        // 60점 이상 -> D학점 입니다.
        // 50점 이상 -> F학점 입니다.
        if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } else if (score >= 70) {
            System.out.println("C학점 입니다.");
        } else if (score >= 60) {
            System.out.println("D학점 입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }

    } // end of main
} // end of class
