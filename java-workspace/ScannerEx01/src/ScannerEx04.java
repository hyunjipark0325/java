import java.util.Scanner;

public class ScannerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "이름 : " );
		String msg = sc.nextLine(); 
		
		System.out.println("=> " + msg.toUpperCase() );
		
		
		sc.close();
	}

}
