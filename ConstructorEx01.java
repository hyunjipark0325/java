class Constructor{
    String data;
    //생성자가 없으면 컴파일러가 자동으로 생성
    //특수한이름의 메서드 
    //return값이 없음
    //class명과 같음
    //디폴트 생성자 
    Constructor(){
        System.out.println("디폴트 생성자 호출");
        data = "홍길동";
    }
    // 생성자 오버로딩
    Constructor(String pdata){
        this.data = pdata;
    }
}
public class ConstructorEx01 {
    public static void main(String[] args) {
        //Constructor() => 생성자 호출
        Constructor c = new Constructor();
        System.out.println("data :" + c.data);

        Constructor c2 = new Constructor("박문수");
        System.out.println("data :" + c2.data);

        
    }
}
