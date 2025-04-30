package Exercise;

public class Exercise2 {

    public static void main(String[] args) {

        // 1. 데이터 10, 100, 100을 변수 선언과 동시에 초기화 하고 화면에 출력
        int num = 10;
        int num1 = 100;
        int num2 = 100;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        // 2. int ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮기기
        int ageBox = 10;
        int ageBox2 = ageBox;
        ageBox = 30;

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        // 힌트 - 임시 변수를 사용하여 값을 교환
        int a = 1;
        int b = 3;
        int c = a;
        a = b;
        b = c;

    } //end of main

} // end of class
