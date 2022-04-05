public class HelloWorld {
    public static void main(String[] args){  //시작
        System.out.println( "안녕 한글" );   // 프로그램내용  출력 + 엔터
        System.out.println( "안녕 한글" ); 
        System.out.println( "안녕 한글" ); 

        System.out.print( "안녕 한글" );   // 프로그램내용  엔터X  한줄로 이어져출력
        System.out.print( "안녕 한글" ); 
        System.out.println( "안녕 한글" );

        System.out.printf( "%s-%s-%s\n", "안녕", "한글","이다" );  //형식화된 출력  (%s 문자열의 위치)    \n  엔터키

    }                                       //끝
}