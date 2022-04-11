
public class ObjectEx01 {
	public static void main(String[] args) {
		
		Object o1 = new Object();
		// 자료형, 주소확인(16진수)
		System.out.println( o1 );
		System.out.println( o1.toString() );
		
		Object o2 = new Object();
		System.out.println( o2.toString() ); 
		//위와 같음 아래처럼 풀어써도됨
		String strObj = o2.toString();
		System.out.println( strObj );
		
		//class  자료형만보기
		System.out.println( o1.getClass().getName() );
		//위와 같음 아래처럼 풀어써도됨
		Class c = o1.getClass();
		String str = c.getName();
		System.out.println( str );
		
		//hashcode 주소만보기 (10진수)
		System.out.println( o1.hashCode());
		System.out.printf( "%x\n", o1.hashCode());  // 10진수 -> 16진수 
		
		Person p = new Person(); //상속코드 작성안해도 object클래스를 상속받음
		System.out.println( p.toString() );
		System.out.println( p );
		System.out.println( p.hashCode() );
		
		String s = new String("Hello");
		System.out.println( s.toString() );
	}
}
