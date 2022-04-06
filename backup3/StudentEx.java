import com.naver.Student;

public class StudentEx {
    public static void main(String[] args) {
        Student str1 = new Student();
        
        str1.name = "홍길동";
        str1.hakbun = "10000";
        str1.age =33;
        str1.height = 175.5;

        System.out.println(str1.hakbun);
        System.out.println(str1.height);
    }
}
