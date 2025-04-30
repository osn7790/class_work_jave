package ch10;

public class GoingToSchool2 {

    public static void main(String[] args) {

        // 버스 객체를 3개 생성해 보시오
        Bus b1 = new Bus(50);
        Bus b2 = new Bus(1002);
        Bus b3 = new Bus(99);

        // 학생 객체를 2명 생성해 보시오
        Student s1 = new Student("짱구", 10000);
        Student s2 = new Student("유리", 20000);


        // 학생이 버스를 타는 행위를 만들어 보세요
        s1.takeBus(b1);
        s2.takeBus(b3);

        // 버스에 상태창을 출력해서 결과를 확인해 보자.
        s1.showInfo();
        s2.showInfo();
    }
}
