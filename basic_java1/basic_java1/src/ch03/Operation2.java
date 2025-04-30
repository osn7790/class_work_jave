package ch03;

/**
 * 복합 대입 연산자는
 * 대입 연산자와 다른 연산자가 함께 쓰이는것
 */
public class Operation2 {

    public static void main(String[] args) {

        int score = 0;

        // 1. 점수 10점 추가
        // score += 100;
        score = score + 10;

        // 2. 점수 5점 감소
        // score -= 5;
        score = score - 5;

        System.out.println("현재 점수 확인 : " + score);

        // 3. 점수 2배 증가
        // score *= 2;
        score = score * 2;

        // 4. 점수 반으로 감소
        // score /= 2;
        score = score / 2;
        System.out.println("현재 점수 확인 : " + score);

        // 나머지 연산
        // score %= 3;
        score = score % 3;
        System.out.println(score);

    } // end of main

} // end of class
