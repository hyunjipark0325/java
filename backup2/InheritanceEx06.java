package backup2;
class Parent {
// 디폴트 생성자
//     Parent(){
//        System.out.println("Parent() 호출 :" +this);
//     }
// }

    Parent(int a){
        System.out.println("Parent(int a) 호출 :" +this);
    }

    Parent(int a, int b){
            System.out.println("Parent(int a, int b) 호출 :" +this);
    }
}


class Child extends Parent {
    Child() {
        super(10);// 부모의 생성자를 지정
        System.out.println("Child() 호출 :" +this);
    }
}
public class InheritanceEx06 {
    public static void main(String[] args) {
        Child c = new Child(); 
       System.out.println("c :"+ c);
    }
}
