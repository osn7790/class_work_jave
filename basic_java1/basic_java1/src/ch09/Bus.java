package ch09;

public class Bus {

    // 속성
    int busId; // 버스 아이디
    String busType; // 버스 종류(시내, 고속)
    String company; // 운영 회사

    // 생성자
    // 메개변수 1 받는 생성자
    public Bus(int id) {
        busId = id;
    }

    public Bus(int id, String type) {
        busId = id;
        busType = type;
    }

    public Bus(int id, String type, String com) {
        busId = id;
        busType = type;
        company = com;
    }

    // 메소드
    public void showInfo() {
        System.out.println("-----------상태창-------");
        System.out.println("버스 ID : " + busId);
        System.out.println("버스 type : " + busType);
        System.out.println("버스 company : " + company);
    }
}
