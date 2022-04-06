package backup2;
class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class ArrayEx01 {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        
        Book book1 = new Book("Java", "홍길동", 10000);
        Book book2 = new Book("JSP", "박문수", 20000);

        Book[] bookArray = new Book[3];

        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = new Book("Spring", "이몽룡", 30000);

        System.out.println(bookArray);
        System.out.println(bookArray[0]);
        System.out.println(book1);

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);

        System.out.println(bookArray[0].title);
        System.out.println(bookArray[1].author);
        System.out.println(bookArray[2].price);

        for(int i=0 ; i<bookArray.length; i++){
            System.out.println(bookArray[i].title+"\t");
            System.out.println(bookArray[i].author+"\t");
            System.out.println(bookArray[i].price+"\n");
        }

        //향상된 for문
        for(Book book : bookArray){
            System.out.println(book.title+"\t");
            System.out.println(book.author+"\t");
            System.out.println(book.price+"\n");
        }
    }
}
