import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 초기화 : seed 
		// 0.0부터 1.0사이의 실수(double)를 무작위로 응답하는 메서드
		Random r1 = new Random( System.currentTimeMillis());
		
		System.out.println( r1.nextDouble() );
		System.out.println( r1.nextInt() );
		
		//0<= x < 10
		System.out.println( r1.nextInt(10) );
		
		// 1 <= x < 46 
		
		System.out.println( r1.nextInt(45)+1);
	}

}
