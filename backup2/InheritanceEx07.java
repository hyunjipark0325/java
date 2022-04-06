package backup2;
//final class Parent {  -  final class  상속금지
    class Parent {
    Parent(){
       System.out.println("Parent() 호출 :" +this);
    }
    // final void viewParent(){   - 오버라이드 불가
    void viewParent(){
        System.out.println("Parent viewParent() 호출");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child() 호출 :" +this);
        this.viewParent();
    }
    //오버라이드
    void viewParent(){
        System.out.println("Child viewChild() 호출");
    }
}
public class InheritanceEx07 {
    public static void main(String[] args) {
        Child c = new Child(); 
       System.out.println("c :"+ c);
    }
}
