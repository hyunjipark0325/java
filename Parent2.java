//불완전 클래스
//인스턴스화 불가능
//반드시 상속
public abstract class Parent2 {
    public Parent2(){
        System.out.println("Parent2 호출");
    }       
    
    


    // 추상클래스는 완전한 메서드 포함할수있음
    //아래 둘다사용가능 자식에서 구현해도됨
    public void viewParent1() {};
    public abstract void viewParent2() ; 

}
