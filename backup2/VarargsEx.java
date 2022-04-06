package backup2;
class Varargs {


    // 가변인자 
    void doFunc(String ... args){
      //  System.out.println(args.length);

      // 데이터 보기
      for( String arg : args){
          System.out.print( arg +"\t");
      }
      System.out.println();
    }

}
public class VarargsEx {
    
    public static void main(String[] args) {
        Varargs v = new Varargs();
        v.doFunc("1");
        v.doFunc("1","2");
        v.doFunc("1","2","3");

    }
}
