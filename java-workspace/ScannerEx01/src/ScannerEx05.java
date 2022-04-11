import java.util.Scanner;

public class ScannerEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		while (true) {//무한반복
			System.out.println("입력 :");
			msg = sc.nextLine();
			if(!msg.equals("exit")) {
				System.out.println(" 입력 메시지 :" + msg.toUpperCase()  );
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	sc.close();
	}

}
