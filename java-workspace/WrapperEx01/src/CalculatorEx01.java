
public class CalculatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if( args.length != 3 ) {
			System.out.println( "인자의 갯수가 틀립니다. : " + args.length );
		}else {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[2]);
			
			if(args[1].equals("+")) {
				System.out.println( "결과 :" + (value1 + value2 ));
			}else if( args[1].equals("-")) {
				System.out.println( "결과 :" + (value1 - value2 ));
			}else if( args[1].equals("X")) {
				System.out.println( "결과 :" + (value1 * value2 ));
			}else if( args[1].equals("/")) {
				System.out.println( "결과 :" + (value1 / value2 ));
			}
		}
	}

}
