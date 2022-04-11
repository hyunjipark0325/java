package pack1;

public class InnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		
		oi.viewInner();
		
		System.out.println(ot.x2);
		System.out.println(oi.y2);
	}

}
