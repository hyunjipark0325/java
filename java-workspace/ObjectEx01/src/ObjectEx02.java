
public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println( o1 );
		System.out.println( o2 );
		
		System.out.println( o1.equals( o2 )); // 주소값에 의한 비교  false
		
		Object o3 = o1;
		System.out.println( o1.equals( o3 ));  // true
		//둘다 객체 주소의 비교 위와 같이쓰임
		System.out.println( o1 == o3 );
		
		String str1 = new String( "박문수" );
		String str2 = new String( "박문수" );
		
		System.out.println( str1 == str2 );// 객체 주소의 비교 
		//아래가 객체 내용의 비교이므로 위와 다름
		System.out.println( str1.equals(str2));//객체 내용의 비교 
	}

}
