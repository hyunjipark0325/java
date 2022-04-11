package pack1;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		
		//형변환
		//묵시적 형변환
		//부모 자식 => 공통인 클래스로 형변환
		Parent p2 = c;
		Parent p3 = new Child();
		
		//모든 클래스의 부모클래스  : Object
		Object o1 = new Child();
		Object o2 = new Parent();
		
		//명시적 형변환
		//부모에서 자식으로 
		Child c2 = (Child)p2;  //가능
		//Child c3 = (Child)new Parent();  // error  자식이 여러명일경우 생각  자식->부모->자식  이렇게 되어야함
	}

}
