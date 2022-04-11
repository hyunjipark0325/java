	
public class CheckJuminEx01{

	public static void main(String[] args) {

		String jumin="1234561234567";
		
		int[]number= {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int sum=0;
		
		for(int i=0; i<12; i++) {
			sum+=(jumin.charAt(i)-'0')*number[i];
		}

		int num1 = sum % 11;
		
		int result = 11-num1;
		
		if (result>9) {
			result = result % 10;
		}
		if(result == jumin.charAt(12)-'0') {
			
			System.out.println("정확");
		}
		else {
			
			System.out.println("부정확");
		}
	}
}	




