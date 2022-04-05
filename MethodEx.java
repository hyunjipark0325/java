class Method{
    //메서드 선언
    void doFunc1(){
        //지역변수
        //제어문
        System.out.println("doFunc1 호출");
    }

    void doFunc2( int data1){
        System.out.println("doFunc2 호출 : " + data1);
    }

    void doFunc3( int data1, int data2){
        System.out.println("doFunc3 호출 : " + data1);
        System.out.println("doFunc3 호출 : " + data2);
    }
    // void  - return 없음
   /* void doFunc4( int data1, int data2){ 
        int sum = data1 + data2;
        return sum;
    }*/

}
public class MethodEx {
    public static void main(String[] args) {
        Method m1 = new Method();
        //호출
        m1.doFunc1();
        m1.doFunc2(10);
        m1.doFunc3(10, 20);

        //int result = m1.doFunc4(30, 40);
       // System.out.println(result);

    }
    
}
