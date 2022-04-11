package pack3; //지역내부 클래스 

public class InnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		
		class Inner {
			private int y1 = 100;
			public int y2 = 100;
			
			public Inner() {
				// TODO Auto-generated constructor stub
				System.out.println("Inner : " + this );
			}
			public void viewInner() {
				System.out.println(x);
				System.out.println(y1);
				System.out.println(y2);
			}
		}
		
		Inner i = new Inner();
		i.viewInner();
	}

}
