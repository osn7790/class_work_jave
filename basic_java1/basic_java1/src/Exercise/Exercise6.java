package Exercise;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        // 스캐너 도구를 사용해서
        // 뺄셈, 곱셈, 나눗셈 연산하는 프로그램을 직접 만들어 보자.
        // 사용자에게 값 2개를 받아서 연산 하시오.

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력:");
        int a = sc.nextInt();
        System.out.println();

        System.out.print("정수 입력:");
        int b = sc.nextInt();
        System.out.println();

        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

    } // end of main
} // end of class
