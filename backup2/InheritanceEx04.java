package backup2;
class Parent {
    void viewParent1(){
        System.out.println("viewParent1() 호출");
    }
}

class Child extends Parent {
    void viewChild(){
        System.out.println("viewChild() 호출");
    }

    //오버라이딩(재정의) 상속받은자가 부모것을 거부하고 다시 정의하는것
    //오버라이딩 하려면 메서드이름, 매개변수개수, 매개변수 자료형이 같아야함
    void viewParent1(){
        System.out.println("child viewParent1() 호출");
    }
}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewChild();
        c.viewParent1();// 오버라이딩된 값이 나옴 "viewChild() 호출"
    }
    
}
