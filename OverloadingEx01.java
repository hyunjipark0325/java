class Overloading{

    // 오버로드(중복정의)- 매서드 이름은 같고 매개변수만 다른경우 /java에만 있음 
    void doTest(int a){
        System.out.println("doTest(int a) 호출");
    }
    void doTest(String s){
        System.out.println("doTest(String s) 호출");
    }

    void doTest(String s, int a){
        System.out.println("doTest(String s, int a) 호출");
    }
    void doTest(int a, String s){
        System.out.println("doTest(int a, String s) 호출");
    }
}
public class OverloadingEx01 {
    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.doTest(10);
        ol.doTest("10");
        ol.doTest("10", 10);

    }
    
}
