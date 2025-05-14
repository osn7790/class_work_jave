package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogDataFormatting {

    public static void main(String[] args) {

        // 직접 포맷팅된 날짜를 출력해보기

        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜와 시간 : " + now);

        DateTimeFormatter allDayhours = DateTimeFormatter.ofPattern("a hh시 mm분");
        DateTimeFormatter KoreanDateTime = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        DateTimeFormatter BasicFrmatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter EnglishDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm");
       // DateTimeFormatter KoreaBasicDoc = DateTimeFormatter.ofPattern()

        System.out.println(now.format(allDayhours));
        System.out.println(now.format(KoreanDateTime));
        System.out.println(now.format(BasicFrmatter));
        System.out.println(now.format(EnglishDateTime));

        System.out.println(allDayhours);
        System.out.println(KoreanDateTime);
        System.out.println(BasicFrmatter);

    }
}
