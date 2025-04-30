package ch06;

public class BusMainTest {
    public static void main(String[] args) {

        Bus b1 = new Bus();

        b1.name = "마을 버스";
        b1.number = 6;
        b1.color = "파란색";

        System.out.println(b1.name);
        System.out.println(b1.number);
        System.out.println(b1.color);
    }
}
