
public class StringEx02 {
	public static void main(String[] args) {
		String str1 = "Hello String Hello String";
		
		//문자열의 길이확인
		System.out.println( str1.length());
		System.out.println( "Hello".length()); //length의 return값은 int
		
		
		//문자열의 첫글자
		char ch1 = str1.charAt(0); //형변환 문자열-> 문자 
		System.out.println( ch1 );
		
		//마지막 문자
		System.out.println( str1.charAt(str1.length()-1 ) );
		
		//문자열 - 부분 문자열 
		String pstr1 = str1.substring(2); // 문자열 2부터 출력
		System.out.println( pstr1 );
		
		String pstr2 = str1.substring(2, 4);//문자열 2부터 4전까지 출력 (4포함안됨)
		System.out.println( pstr2 );
		
		//위치검색
		//lastIndexOf
		System.out.println( str1.indexOf("1" ));
		
		//문자열 검색 - (대소문자 구별)
		//contains / endswith(~로 끝나냐)
		System.out.println( str1.startsWith("He"));
		//치환 
		System.out.println( str1.replaceAll("Hello", "안녕"));
		
		//문자열 결합 (+)
		System.out.println( "Hello" + "World");
		System.out.println( "Hello".concat ("World"));
		
		//대소문자 변환
		System.out.println("hello".toUpperCase() );
		System.out.println("HELLO".toLowerCase() );
		
		//공백제거
		String ostr1= "              Hello                     ";
		String ostr2= ostr1.trim();
		System.out.println( ostr1 );
		System.out.println( ostr2 );
		System.out.println( ostr1.length() );
		System.out.println( ostr2.length() );
		
		// 문자열 분리
		String sStr1 = "apple,banana,pineapple,kiwi";
		String[] strArray = sStr1.split(",");
		for( String str : strArray) {
			System.out.println( str );
		}
		
		// System.out.printf
		//형식화된 문자열 제작
		//static
		String fStr1 = String.format("%s-%s-%s", "apple","banana","pineapple");
		System.out.println( fStr1 );
		

	}
}
