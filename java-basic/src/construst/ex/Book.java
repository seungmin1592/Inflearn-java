package construst.ex;

public class Book {
    String title;
    String author;
    int page;

    // 코드 완성
    Book(){
        this("", "");
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목 : " + this.title + " 저자 : " + this.author + " 페이지 : " + this.page);
    }
}
