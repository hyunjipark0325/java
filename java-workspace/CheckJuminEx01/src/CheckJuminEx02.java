
public class CheckJuminEx02 {

	public static void main(String[] args) {
		// 입력
		// java CheckJuminEx02 "123456-1234567"
		// 입력값 검사
		if(args.length !=1) {
			System.out.println( "java 클래스명 '123456-1234567'형식으로 입력해주세요. ");
			System.exit(0);
		}
		
		System.out.println( "정상입력" );
		
		// 처리
		String strJumin = args[0].replaceAll("-","");
		System.out.println( strJumin );
		
		int num01 = Integer.parseInt(strJumin.substring(0, 1)) * 2;
		int num02 = Integer.parseInt(strJumin.substring(1, 2)) * 3;
		int num03 = Integer.parseInt(strJumin.substring(2, 3)) * 4;
		int num04 = Integer.parseInt(strJumin.substring(3, 4)) * 5;
		int num05 = Integer.parseInt(strJumin.substring(4, 5)) * 6;
		int num06 = Integer.parseInt(strJumin.substring(5, 6)) * 7;
		int num07 = Integer.parseInt(strJumin.substring(6, 7)) * 8;
		int num08 = Integer.parseInt(strJumin.substring(7, 8)) * 9;
		int num09 = Integer.parseInt(strJumin.substring(8, 9)) * 2;
		int num10 = Integer.parseInt(strJumin.substring(9, 10)) * 3;
		int num11 = Integer.parseInt(strJumin.substring(10, 11)) * 4;
		int num12 = Integer.parseInt(strJumin.substring(11, 12)) * 5;
		
		int lastnum = Integer.parseInt(strJumin.substring(12, 13));
		
		//System.out.println( num01 );
		//System.out.println( num02 );
		
		int sum = num01 + num02 + num04 + num05 +num06+ num07+num08+num09+num10+num11+num12;
		int resultNum = (11-(sum%11))%10;
		// 출력
		if (lastnum == resultNum) {
			System.out.println("맞음");
		}else {System.out.println("틀림");
	}
}
}
