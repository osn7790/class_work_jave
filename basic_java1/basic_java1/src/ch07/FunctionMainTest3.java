package ch07;

// 코드를 실행 시켜보는 측
public class FunctionMainTest3 {

    // main 함수
    public static void main(String[] args) {

        //int n1;
        //int n2;

        int result1 = num(20, 30);
        int result2 = num1(40, 30);
        int result3 = num2(60, 30);
        int result4 = num3(10, 30);

        System.out.println("덧셈 : " + result1);
        System.out.println("뺄셈 : " + result2);
        System.out.println("나눗셈 : " + result3);
        System.out.println("곱하기 : " + result4);

    } // end of main

    // static void a(){}

    // 덧셈 연산 기능
    static int num(int n1, int n2) {
        int result1 = n1 + n2;
        return result1;
    }

    // 뺄셈 연산 기능
    static int num1(int n1, int n2) {
        return n1 - n2;
    }

    // 나눗셈 연산 기능
    static int num2(int n1, int n2) {
        return n1 / n2;
    }

    // 곱하기 연산 기능
    static int num3(int n1, int n2) {
        return n1 * n2;
    }

} // end of class
