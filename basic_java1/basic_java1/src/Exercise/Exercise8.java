package Exercise;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        // 프로그래밍에서는 C R U D 개념이 있다.
        // 생성, 조회, 수정 , 삭제
        // 실행에 흐름을 만들어 보는 엽습 1단계

        // 1. 스캐너
        // 2. while
        // 3. 만약 ... if 구문 활용

        //boolean flag = true;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("메뉴선택");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택: ");

            // 값을 활용하기 위해 변수가 필요
            int i = sc.nextInt(); // 키보드에서 정수값을 받을 수 있는 명령어

            System.out.println("-----------------------");

            if (i == 1) {
                System.out.println("등록을 선택했습니다.");
            } else if (i == 2) {
                System.out.println("조회를 선택했습니다.");
            } else if (i == 3) {
                System.out.println("수정을 선택했습니다.");
            } else if (i == 4) {
                System.out.println("삭제를 선택했습니다.");
            } else if (i == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
                //flag = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
            } // end of while
        }
    } // end of main
} // end of class
