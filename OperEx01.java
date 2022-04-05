public class OperEx01 {
    public static void main(String[]args){
        // 산술연산자는 int 중심
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2 ;
        System.out.println(sum1);

        short s1 = 10;
        short s2 = 20;
      //  short sum2 = s1 + s2;
       // System.out.println(sum2);

        int sum2 = s1 +s2;   //short 값이 바로 int 로 변경된다
        System.out.println(sum2);


        short sum3 = (short)(s1+s2);
        System.out.println(sum3);

        //숫자 3자리수마다 _로 표시 안해도됨 보기편하게
        int i3 = 100_000_000; 
        int i4 = 200_000_000;
        int product1 = i3 + i4;
        System.out.println(product1);

        //overflow - int 범위를 넘어가면 -로 나옴 
        int product2 = i3 * i4;
        System.out.println(product2);

        long product3 = (long)i3 * i4;
        System.out.println(product3);
        
    }
    
}
