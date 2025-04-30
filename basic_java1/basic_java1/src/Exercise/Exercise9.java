package Exercise;

public class Exercise9 {

    // 메인 함수
    public static void main(String[] args) {
        // 호출 연습
        greet("길동");
        int sum1 = square(10);
        System.out.println("sum1 " + sum1);

        String reult = signOfNumber(0);
        System.out.println("result : " + reult);

        boolean isAdult = checkAdult(18);
        System.out.println("isAdult : " + isAdult);

        int max = findMax(100, 1001);
        System.out.println("max : " + max);

    } // end of main


    // 1.
    // void --> 텅 빈
    static void greet(String n1) {
        System.out.println("안녕하세요 [" + n1 + "] 님!");
    }

    // 2.
    static int square(int n1) {
        return n1 * n1;
    }

    // 3.
    static String signOfNumber(int n1) {
        if (n1 == 0) {
            return "ZERO";
        } else if (n1 > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // 4.
    static boolean checkAdult(int age) {
        boolean result = (age >= 18);
        return result;

//        if(age >= 18){
//            return true;
//        }else{
//            return false;
//        }
    }

    // 5.
    static int findMax(int n1, int n2) {
        // 삼항 : (조건식) ? 결과1 : 결과2
        int result = (n1 > n2) ? n1 : n2;
        return result;
    }
} // end of class

