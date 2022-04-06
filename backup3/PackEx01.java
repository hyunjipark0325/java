import com.PackB;  // 패키지 불러올때 - import
import com.exam.test.PackC;

public class PackEx01 {
    public static void main(String[] args) {
        //javac -encoding utf-8 PackA.java
        PackA pa = new PackA();

        //javac -encoding utf-8 PackB.java
        //PackB pb = new PackB();


        //패키지 컴파일 
        //javac -d . -encoding utf-8 PackB.java
        // //패키지. 클래스명
        // com.PackB pb = new com.PackB();
        // com.exam.test.PackC pc = new com.exam.test.PackC();

        PackB pb = new PackB();
        PackC pc = new PackC();

    }
    
}
