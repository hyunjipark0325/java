package backup2;

class Constructor{
    String data;
    //생성자를 직접만들면 디폴트 생성자Constructor() 선언X
    Constructor( String data){
        this.data =data;
    }
}
public class ConstructorEx02 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor("홍길동"); // 생성자를 직접만들면 ()여기안에 값을 넣어 주거나  디폴트 생성자Constructor() 선언
        System.out.println("data : "+ c1.data);
    }
}
