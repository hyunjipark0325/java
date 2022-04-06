package backup2;

class Constructor{
    String hakbun;
    String name;

        //내부에서 생성자를 호출 : this()
    Constructor(){
       // this.hakbun = "0000";
       // this.name = "아무개";
        this("0000","아무개");
    }
    Constructor(String name){
      //  this.hakbun = "0000";
       // this.name = name;
        this("0000",name); // this 호출은 생성자의 첫 번째 문장이어야한다
    }
    Constructor(String hakbun, String name){
        this.hakbun = hakbun;
        this.name = name;
    }
}
public class ConstructorEx04 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1.hakbun + ":" + c1.name);

        Constructor c2 = new Constructor("박문수");
        System.out.println(c2.hakbun + ":" + c2.name);

        Constructor c3 = new Constructor("1111","박문수");
        System.out.println(c3.hakbun + ":" + c3.name);

    }
}
