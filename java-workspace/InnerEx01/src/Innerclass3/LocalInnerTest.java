package Innerclass3; //지역내부 클래스 

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
