import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println( "입력 : " );
		//String msg = sc.next();
		String msg = sc.nextLine(); //스페이스바까지 안짤리고 입력문 전체 출력 
		
		System.out.println("입력값 : " + msg );
		sc.close();
	}

}
