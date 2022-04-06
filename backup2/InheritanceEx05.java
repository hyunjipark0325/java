package backup2;
class Parent {
   Parent(){
       System.out.println("Parent() 호출 :" +this);
   }
   void viewParent(){
       System.out.println("Parent viewParent() 호출");
   }
}

class Child extends Parent {
    Child(){
        System.out.println("Child() 호출 :" +this);
       // this.viewParent(); // this. 안써도 같음
        super.viewParent(); // 자식안에서 부모값 쓰고싶을때
    }
    void viewParent(){
        System.out.println("Child viewParent() 호출");
    }
 }
public class InheritanceEx05 {
    public static void main(String[] args) {
        Child c = new Child(); // 부모클래스도 같이 먼저호출됨 
       System.out.println("c :"+ c);
    }
    
}
