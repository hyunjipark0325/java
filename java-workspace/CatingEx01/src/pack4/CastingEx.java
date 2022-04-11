package pack4;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("아반테",4,"레드");
		Car car2 = new Car("소나타",4,"블루");
		Car car3 = new Car("제네시스",4,"블랙");
		
		//배열
		Car[] cars = new Car[3];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		for(Car car :cars) {
			System.out.println(car.toString());
		}
		
		Object[] objects = new Object[3];
		//묵시적 형변환
		objects[0] = car1;
		objects[1] = car2;
		objects[2] = car3;
		
		for( Object obj : objects ) {
			//명시적 형변환
			Car car = (Car)obj;
			System.out.println(car);
		}
	}

}
