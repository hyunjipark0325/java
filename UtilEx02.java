// 단수를 입력받아 구구단을 출력하는 doGugudan2 메서드 ( 단수를 가변입력)
class Util{
    void doGugudan2(int ...  dan){
        for(int i=1; i<=9; i++){
 //           System.out.println( dan +"X"+i+"="+(dan*i));
        }
    }
}
public class UtilEx02 {
    public static void main(String[] args) {
        Util u = new Util();
        u.doGugudan2(6);
    }
}
