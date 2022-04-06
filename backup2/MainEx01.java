package backup2;
public class MainEx01 {
    String data;
    void doFunc(){
        System.out.println("doFunc 호출");
    }
   public static void main(String[] args) { // static - 인스턴스화 전에 메모리에 상주 
       System.out.println("main");

       MainEx01 m = new MainEx01(); //인스턴스화
       //this.doFunc();
       m.doFunc();
       
   } 
}
