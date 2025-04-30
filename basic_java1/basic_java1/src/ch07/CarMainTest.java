package ch07;

public class CarMainTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1);
        System.out.println(c2);

        c1.name = "제네시스";
        c1.color = "블랙";
        c2.name = "아우디";
        c2.color = "블루";

        System.out.println(c1.color);
        System.out.println(c1.name);
        System.out.println("------------");
        System.out.println(c2.color);
        System.out.println(c2.name);
    }
}
