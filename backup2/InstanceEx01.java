package backup2;
class Instance {
    //인스턴스 멤버필드 / 독립적으로 생성됨 
    String data1;
    //클래스 멤버필드
    static String data2;  // *static* 클래스로 공간공유됨 

    //인스턴스 메서드
    void doFunc1(){
        System.out.println("doFunc1() 호출");
    }
    //클래스 메서드
    static void doFunc2(){
        System.out.println("doFunc2() 호출");
    }
}
public class InstanceEx01 {
    public static void main(String[] args) {
        Instance i1 = new Instance();
        i1.data1 = "홍길동";
        i1.data2 = "홍길동";
        i1.doFunc1();

        Instance i2 = new Instance();
        i2.data1 = "박문수";
        i2.doFunc1();
        System.out.println(i2.data1);
        System.out.println(i2.data2);
        System.out.println(Instance.data2);
        Instance.doFunc2();


    }
    
}
