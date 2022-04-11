import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//특정날짜 셋팅
		Calendar c = Calendar.getInstance();
		c.set(2022, 4-1, 1);
		System.out.println( c.getTime() );
		
		// 특정날짜 추가  몇일후 /몇년후
		c.add(Calendar.DATE, 1 );  // 하루뒤
		System.out.println(c.getTime() );
		
		c.add(Calendar.DATE, -2 ); // 이틀전 
		System.out.println(c.getTime() );
		
		c.add(Calendar.MONTH, 1 ); //한달뒤
		System.out.println(c.getTime() );
		
		c.add(Calendar.YEAR, 1 );
		System.out.println(c.getTime() );
		
	}

}
