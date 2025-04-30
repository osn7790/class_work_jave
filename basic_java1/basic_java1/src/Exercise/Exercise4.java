package Exercise;

public class Exercise4 {

    public static void main(String[] args) {

        // 59.99
        // 30% 할인된 가격을 출력 하시오.
        final double NUM = 59.99;
        final double NUM1 = 0.30; // 30% -> 퍼센트 100분의

        // 할인된 가격 = 원가 − (원가 × 할인율)
        double result = NUM - (NUM * NUM1);

        // 할인된 가격 = 원가 × (1 − 할인율)
        //double result = NUM * (1 - NUM1);
        System.out.println(result);
        // 최종 가격을 정수로 형 변환(강제 형 변환)
        int finalresult = (int) result;
        System.out.println("최종 할인 가격 : " + finalresult);
    }

}
