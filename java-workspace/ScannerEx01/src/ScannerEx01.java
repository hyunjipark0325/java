import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력 - 키보드입력 - 표준입력 - System.in
		Scanner sc = new Scanner(System.in);
		System.out.println( "입력 : " );
		String msg1 = sc.next(); //입력할때까지 대기 / 입력하면 아래문이 출력됨 (스페이스바치면 그전까지만 출력됨)
		String msg2 = sc.next();
		String msg3 = sc.next();
		
		System.out.println("입력값 : " + msg1 );
		System.out.println("입력값 : " + msg2 );
		System.out.println("입력값 : " + msg3 );
		
	}

}
