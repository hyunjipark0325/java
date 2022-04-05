class Variable{
    String data1 = "data1";

    void printVariable(){
        String data2 = "data2";
        //if / for ...
        {
            String data3 = "data3";

            String data1 = "data11";


            System.out.println(data1);
            System.out.println(this.data1);
            System.out.println(data2);
            System.out.println(data3);
        }
         
        System.out.println(data2);
    }
}
public class VariableEx02 {
    public static void main(String[] args) {
      Variable v = new Variable();
      v.printVariable();
    }
    
}
