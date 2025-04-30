package ch07;

public class DogMainTest {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        System.out.println(d1);
        System.out.println(d2);

        d1.age = 2;
        d1.name = "강아지";
        d1.color = "흰색";

        d2.name = "멍멍이";
        d2.age = 3;
        d2.color = "갈색";


        System.out.println(d1.age);
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println("------------");
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.color);

    } // end of main
} // end of class
