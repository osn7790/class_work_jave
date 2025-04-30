package lotto.ch02;

import java.util.Arrays;
import java.util.Random;

/**
 * SRP - 클래스를 설계할 때의 원칙중에 하나이다.
 * 단일 책임의 원칙 (클래스는 가능한 단 하나의 책임을 가지는 것이 좋다.
 */

public class LottoRandomNumber {

    static final int LOTTO_NUMBER_COUNT = 6;

    public int[] createNumber() {


        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];
        Random random = new Random();

        for (int i = 0; i < lottoWinNum.length; i++) {
            lottoWinNum[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoWinNum[j] == lottoWinNum[i]) {

                    i--;
                }
            }

        }


        Arrays.sort(lottoWinNum);
        return lottoWinNum;
    }


// 테스트 코드 작성

    public static void main(String[] args) {
        LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
        int[] result = lottoRandomNumber.createNumber();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}


// 중복 기능을 없애야 한다.
// 1 2 32 42 1 45


// 0번째 인덱스랑 1번째 인덱스 값이 같은가
// 0번쨰 인덱스와 2번째 인덱스 값이 같은가
// 0번쨰 인덱스와 3번째 인덱스 값이 같은가
// 0번쨰 인덱스와 4번째 인덱스 값이 같은가 --> 다시 번호를 생성
