package Exercise;

public class OrkMainTest {

    public static void main(String[] args) {

        Ork o1 = new Ork();

        o1.name = "오크";
        o1.age = 20;
        o1.color = "초록색";

        System.out.println(o1.name);
        System.out.println(o1.age);
        System.out.println(o1.color);

        System.out.println("----------");
        Ork o2 = new Ork();

        o2.name = "오크2";
        o2.age = 12;
        o2.color = "노란색";

        System.out.println(o2.name);
        System.out.println(o2.age);
        System.out.println(o2.color);

    }
}
