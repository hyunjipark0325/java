import com.exam1.Child;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	
		Parent p = new Parent("홍길동", 40);
		System.out.println( p.getName() );
		System.out.println( p.getAge() );
		
		Child c = new Child();
		c.setName("홍길동");
		c.setAge(30);
		System.out.println( c.getAge() );
		System.out.println( c.getName() );
	}

}
