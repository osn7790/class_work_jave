package _my_bubble;

public class TestExam {

    public static void main(String[] args) {

        int x = 3, y = 0;
        while(x-- > 0 ) {
            if(x % 3 == 0)
                continue;
            y++;
            System.out.println("y와일전의값" + y);
        }
        System.out.println(y);


    }
}
