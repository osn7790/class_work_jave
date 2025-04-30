package Exercise;

public class RectangleAreaCalculator {
    public static void main(String[] args) {

        // 상수를 선언해서 코드를 직접 만들어 보자.
        // 사각형에 가로 길이 상수 선언
        final int WIDTH = 10;
        // 사각형에 세로 길이 상수 선언
        final int HEIGHT = 20;
        // 사각형의 면적 계산 식을 만들고 그 연산에 결과 값을 area 변수에 담아보자.
        int area = WIDTH * HEIGHT;

        System.out.println("사각형의 면적: " + area);
    }
}
