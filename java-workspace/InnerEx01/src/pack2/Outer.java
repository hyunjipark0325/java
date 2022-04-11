package pack2;

public class Outer {
	private int x1 = 100;
	public int x2 = 100;
	
	static class Inner{
		private int y1 = 100;
		public int y2 = 100;
		
		public Inner() {
			System.out.println("Inner: " + this );
			
			}
		// static이 먼저 생성되기떄문에 
		//힙메모리에 static class만 올라가 버려서 outer 멤버변수들은 활용이 불가능
		public void viewInner() {
			//System.out.println(x1);
			//System.out.println(x2);
			System.out.println(y1);
			System.out.println(y2);
		}
	}
}
