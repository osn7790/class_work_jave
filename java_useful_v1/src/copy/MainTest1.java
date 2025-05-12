package copy;

public class MainTest1 {

    // Stack 메모리 라는 곳에서 할당
    public static void main(String[] args) {
        // 얕은 복사(Shallow Copy) - 주소값 복사
        // 기본데이터 타입(소문자), 참조 타입

        int a = 10;
        int b = a; // 기본 데이터 타입은 값 복사
        b = 100;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // person1 --> 참조 변수 (변수안에 담기는 값은 --> heap 메모리에 있는 주소값이 담긴다)
        Person person1 = new Person("홍길동");
        Person person2 = person1; // 주소값 복사가 된다 ---> 얕은 복사라고 한다.
        Person person3 = new Person("사코");
        // 즉, person1 과 person2는 같은 객체를 바라보고 있기 때문에
        person2.name = "티모";
        System.out.println(person1.name);
        System.out.println(person3);
        person3.name = "가렌";
        person1.name = "문도";
        System.out.println(person1);
        System.out.println(person2);



    }
} // end of class

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
