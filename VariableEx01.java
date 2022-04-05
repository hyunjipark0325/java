class Variable{
    //객체 :null
    String data1;
    // 초기값 0 / 0.0
    int data2;
    // 초기값 '' 
    char data3;

    void printVariable(){
        System.out.println("printVariable() 호출");
        //System.out.println("data1 :" + data1);
        //this : 자기참조
        System.out.println("this :" + this);
        //멤버변수(클래스안에있는)는 자동초기화
        System.out.println("data1 :" + this.data1);
        System.out.println("data2 :" + this.data2);
        System.out.println("data3 :" + this.data3);

        //지역변수 : 매서드안에있는것
        // 반드시 초기화 후에 사용해야함
        String data2;
        data2 = "a";
        System.out.println("data2 :" + data2);

    }
}
public class VariableEx01 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.printVariable();
        System.out.println("v:"+ v);
    }
    
}
