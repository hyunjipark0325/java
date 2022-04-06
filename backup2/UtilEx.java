package backup2;
class Util{

    void doGugudan(int dan){
        for(int i=1; i<=9; i++){
            System.out.println( dan +"X"+i+"="+(dan*i));
        }
    }
}
public class UtilEx {
    public static void main(String[] args) {
        Util u = new Util();
        u.doGugudan(6);
    }
}
