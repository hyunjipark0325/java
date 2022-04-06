package backup2;

//207p
class Book{
    private String bookName;
    private String author;
    public Book(){}// 디폴트 생성자
    public Book(String bookName, String author){//책 이름과 저자 이름을 매개변수로 받는 생성자
        this.bookName = bookName;
        this.author = author;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBookInfo() {
        System.out.println(bookName+","+author); // 책정보를 출력해주는 메서드
    }
}
public class ArrayEx02 {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // Book클래스형으로 객체 배열 생성

        // 인스턴스 생성후 배열에 저장
        library[0] = new Book("태백산맥","조정래");
        library[1] = new Book("데미안","헤르만 헤세");
        library[2] = new Book("어떻게 살 것인가","유시민");
        library[3] = new Book("토지","박경리");
        library[4] = new Book("어린왕자","생택쥐페리");

        for(int i =0; i< library.length; i++){
            library[i].showBookInfo(); // Book인스턴스 멤버들
        }

        for(int i = 0; i<library.length; i++){
            System.out.println(library[i]);  //Book 인스턴스를 저장한 메모리 주소
        }
    }
}
