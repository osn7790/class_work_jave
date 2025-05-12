package collections;

import java.util.HashMap;

public class BookMapAddSystem {

    private HashMap<String, Book> bookHashMap;

    public BookMapAddSystem() {
        bookHashMap = new HashMap<>();
    }

    // 저장하는 메서드만 만들어 보세요 (자료구조에 저장하는 기능만 설계)
    public void addBook(String title, String author) {
        bookHashMap.put(title, new Book(title, author));
    }

    // 콘솔창에 출력하는 메서드를 만들어 보세요 단, 책 제목과 저자를 모두 출력해야 합니다.
    public void printAllBook() {
        for (Book b : bookHashMap.values()) {
            System.out.println(b.toString());
        }
    }
    // Book 클래스에 이름 저자넣고
    // addBook에 new로  Book 객체만들면서 밸류가 전부나오도록
    // b라는 키값을 부르면 밸류인 Book 객체가 나와서 저자 이름이 콘솔창에 출력됨. ( toString )

    public static void main(String[] args) {

        BookMapAddSystem bookMapAddSystem = new BookMapAddSystem();
        bookMapAddSystem.addBook("넥서스", "유발 하라리");
        bookMapAddSystem.addBook("홍길동전", "허균");
        bookMapAddSystem.addBook("이기적인 유전자","리처드 도킨스");


        bookMapAddSystem.printAllBook();
    }

}


// 데이터 타입 선언
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
