package pack1;

public class Outer {
	private int x1 = 100;
	public int x2 = 100;
	
	public Outer() {
		System.out.println( "Outer : "+ this);
	}
	
	// Instance Inner class
	class Inner{
		private int y1 = 100;
		public int y2 = 100;
		
		Inner(){
			System.out.println( "Inner :" +this);
		}
		public void viewInner() {
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(y1);
			System.out.println(y2);
		}
	}
}
