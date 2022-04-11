package pack2;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.viewChild1();
		c1.viewParent1();
		c1.viewParent2();
		
		Child2 c2 = new Child2();
		c2.viewChild1();
		c2.viewParent1();
		c2.viewParent2();
		
		System.out.println();
		
		Parent p1= c1;
		p1.viewParent1();
		p1.viewParent2();
		
		Parent p2= c2;
		p2.viewParent1();
		p2.viewParent2();
	}

}
