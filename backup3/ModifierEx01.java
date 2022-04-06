// 데이터 은닉
class Modifier {
    String data1 = "default";
    public String data2 = "public"; //public - 외부 클래스 어디에서나 접근가능 
    protected String data3 = "protected"; //protected - 같은 패키지 내부와 상속관계의 클래스에서만 접근가능 
    private String data4 = "private"; //private - 같은 클래스 내부에서만 접근가능

    void viewData(){
        System.out.println(this.data1);
        System.out.println(this.data2);
        System.out.println(this.data3);
        System.out.println(this.data4);
    }
}

public class ModifierEx01 {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        System.out.println(m.data1);
        System.out.println(m.data2);
        System.out.println(m.data3);
        //System.out.println(m.data4);// private는 외부데이터에서 접근이 불가

        m.viewData();
    }
}
