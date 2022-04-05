public class TypeEx10 {
    public static void main(String[]args){
        //형변환

        //자동변환  
        //묵시적 형 변환 - 바이트 크기가 작은자료형에서 큰자료형으로 대입
        int i1 = 20;
        long l1 = i1;
        System.out.println(l1);

        //강제형변화 
        //명시적 형 변환 - 큰자료형에서 작은 자료형으로 대입
        short s1 = (short)i1;  // 강제로 바꿀 형을 괄호에 명시 
        System.out.println(s1);

        //문자 
        char c1 = 'A';
        int i2 = c1 +3;
        System.out.println(i2);
        System.out.println((char)i2);  // ascii코드에서 문자로 형변환



    }
    
}
