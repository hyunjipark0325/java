import java.util.Random;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random( System.currentTimeMillis());
		
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=6; j++) {
					
					System.out.printf("%3d", r.nextInt(45)+1 );
				}
				System.out.println();
			}	
	}
}
