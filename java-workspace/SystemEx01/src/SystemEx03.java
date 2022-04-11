
public class SystemEx03 {
	
	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for( int i=0; i<1_000_000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println((time2 - time1 )+ "경과");
	}
}
