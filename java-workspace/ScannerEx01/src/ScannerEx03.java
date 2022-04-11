import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print( "구구단 입력 : " );
		String dans = sc.nextLine();
		
		String[] arrDans = dans.split(",");
		for(String dan : arrDans) {
            for(int i=1 ; i<=9 ; i++){
            	System.out.printf("%sx%s=%s\t", dan, i, (Integer.parseInt(dan)*i) );
            }
            System.out.println();
        }
		sc.close();
	}

} 