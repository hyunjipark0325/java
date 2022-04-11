import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("박문수", 20);
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		
		Person p = (Person)al.get(0);
		System.out.println(p);
		
		//향상된 for문 
		for(Object o : al) {
			Person ps = (Person)o;
			System.out.println(ps);
		}
	}
}
