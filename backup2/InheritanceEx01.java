
package backup2;
class parent {
    void ViewParent(){
        System.out.println("viewParent 호출");
    }
}

class Child1 {
    void ViewChild(){
        System.out.println("viewChild2 호출");
    }
}    
class Child2 extends parent{
    String c ="박문수";
    void ViewChild(){
        System.out.println("viewChild2() 호출");
    }
}

public class InheritanceEx01 {
    public static void main(String[] args) {
        parent p = new parent();
        p.ViewParent();

        Child1 c1 = new Child1();
        c1.ViewChild();

        Child2 c2 = new Child2();
        c2.ViewChild();
        c2.ViewParent();
        System.out.println(c2.c);
        System.out.println(c2);


    }
}
