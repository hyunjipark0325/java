import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calendar c = Calendar.getInstance();
	System.out.println(c.toString());
	
	//get(enum)
	System.out.println( c.get(Calendar.YEAR));
	System.out.println( c.get(Calendar.MONTH)+1);
	System.out.println( c.get(Calendar.DATE));
	System.out.println(c.get(Calendar.DAY_OF_WEEK));  // 일요일 : 1 
	
	System.out.println(c.getTimeInMillis());
	}
	

}
