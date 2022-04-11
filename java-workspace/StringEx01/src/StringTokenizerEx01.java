import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1 = "사과 참외 수박 딸기";
		StringTokenizer str1 = new StringTokenizer(strData1);
		/*
		System.out.println( str1.countTokens()); //공백으로 몇개나눠져있는지
		System.out.println( str1.nextToken()); // 순서대로 하나씩 출력
		System.out.println( str1.nextToken());
		System.out.println( str1.hasMoreTokens()); //데이터가 더있는지 확인  hasMoreTokens 가 거짓이 될때까지 출력됨
		*/
		while( str1.hasMoreTokens()) {
			System.out.println( str1.nextToken());
		}
		
		String strData2 = "사과&참외&수박&딸기";
		StringTokenizer st2 = new StringTokenizer(strData2, "&"); // "&" 로 분리
		while( st2.hasMoreTokens()) {
			System.out.println( st2.nextToken());
		}
		
		String strData3 = "x=100*(200+300)/2";
		StringTokenizer st3 = new StringTokenizer(strData3, "+-*/=()"); // "+-*/=()" 하나하나가 분리단위가됨
		while( st3.hasMoreTokens()) {
			System.out.println( st3.nextToken());
		}
	}

}
