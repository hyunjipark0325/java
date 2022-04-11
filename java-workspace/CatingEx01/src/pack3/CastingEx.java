package pack3;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기존의 형태 (인스턴스화)
		Human h = new Human();
		h.move();
		
		Tiger t = new Tiger();
		t.move();
		
		Eagle e = new Eagle();
		e.move();
		
		//다형성
		Animal a = new Human();
		a.move();
		a = new Tiger();
		a.move();
		a = new Eagle();
		a.move();		
	}

}
