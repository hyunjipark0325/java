package backup;
public class TypeEx06 {
    public static void main(String[]args){
        //정수형 (자료형이 사용할 공간의 크기 byte가 다름)
        byte b =1;
        short s = 1;
        int i = 1;
        long l = 1;
        long l2 = 1L;  // L 은 long형을 나타내는 식별자


        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(l2);

        // int i2 = 1L;  // 형변화 error  : 큰 -> 작은 것으로 갈때 에러 
        // System.out.println(i2);


    }
    
}
