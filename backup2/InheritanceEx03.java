package backup2;
//상속의 상속
class Parent {
    String p ="부모";
    void ViewParent(){
        System.out.println("viewParent1() 호출");
    }
}

class Child1 extends Parent {
    String c ="자식";
    void ViewChild(){
        System.out.println("viewChild() 호출");
    }
}

class Child2 extends Parent {
    void ViewChild(){
        System.out.println("viewChild2() 호출");
    }
}

class GrandChild1 extends Child1{
    String gc ="손자";
    void viewGrandchild(){
        System.out.println("GrandChild1 viewGrandchild() 호출");
    }
}

class GrandChild2 extends Child2{
    void viewGrandchild(){
        System.out.println("GrandChild2 viewGrandchild() 호출");
    }
}



public class InheritanceEx03 {
    public static void main(String[] args) {
    //    Child1 c1 = new Child1();
    //    c1.ViewChild();

    //    Child2 c2 = new Child2();
    //    c1.ViewChild();

       GrandChild1 gc1 = new GrandChild1();
       gc1.viewGrandchild();
       gc1.ViewChild();
       gc1.ViewParent();

       System.out.println(gc1.p);
       System.out.println(gc1.c);
       System.out.println(gc1.gc);

       
    }
}
