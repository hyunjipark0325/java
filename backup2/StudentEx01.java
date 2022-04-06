package backup2;
//데이터 클래스 선언
class Student{
    int StudentID;
    String StudentName;
    int grade;
    String address;
}
//실행 클래스 선언
//main
//실행 클래스 이름 = 파일명
public class StudentEx01 {
    public static void main(String[]args){
        int num;
        num = 10;
        System.out.println(num);

        //객체(참조) 변수(인스턴스) 선언
        Student str1;
        //new 메모리 생성연산자
        str1 = new Student();
        //초기화
        // .  객체 참조 연산자
        str1.StudentID = 10;
        str1.StudentName = "홍길동";
        str1.grade = 2;
        str1.address ="서울";
        str1.StudentID = 20;

        System.out.println(str1.StudentID);
        System.out.println(str1.StudentName);

        System.out.println(str1);
        
        Student str2 = new Student();
        System.out.println(str2); // 2로 새로 선언하면 새로운 저장공간이 생김 주소가 다름 
        str2.StudentID = str1.StudentID;
        str2.StudentName = "홍길2222동";
        str2.grade = 22222;
        str2.address ="서22222울";
        System.out.println(str2.StudentID); 

    }
  
    
}
