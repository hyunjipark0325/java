package backup;
public class OperEx04 {
    public static void main(String[]args){
        //비교 연산자
        System.out.println( 10 == 5 ); // 두항의 값이 같으면 참
        System.out.println( 10 != 5 ); // 두항의 값이 다르면 참 
        System.out.println( 10 > 5 );  // 왼쪽 항의 값이 크면 참 


        int num1 =10;
        int num2 =20;
        
        boolean flag = (num1>0)&&(num2>0); //&&  - 두항 모두 참인경우에만 결과값 참 
        System.out.println(flag);

        flag = (num1<0)&&(num2>0);
        System.out.println(flag);

        flag = (num1<0)||(num2>0);  // || 두항중 하나의 항만 참이면 결과값 참 
        System.out.println(flag);

        int i = 2;

        boolean value = ((num1=num1+10)<10)&&((i=i+2)<10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);  // 앞항의 값이 거짓이므로 뒷항은 실행되지 않는다 그래서 i값은 계산되지않아 증가되지않음

        value = ((num1=num1+10)>10)||((i=i+2)<10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

    }
    
}
