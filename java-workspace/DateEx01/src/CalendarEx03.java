import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//달력만들기
		int year = 2022;
		int month = 4;
		// 첫날
		Calendar startCalendar = Calendar.getInstance();
		// 마지막날
		Calendar endCalendar = Calendar.getInstance();
		
		startCalendar.set(year, month-1, 1);
		endCalendar.set(year, month, 1 - 1);
		
		System.out.println(startCalendar.getTime());
		System.out.println(endCalendar.getTime());
		
		int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
		int endDate = endCalendar.get(Calendar.DATE);
		
		System.out.println( " SU  MO TU WE TH FR SA" ); //개발자가 출력형식 지정
		
		for( int i=1; i<startDayOfWeek; i++) {
			System.out.print("   "); //공백 3칸 
		}
		for( int i=1, n=startDayOfWeek; i<=endDate; i++, n++) {
			System.out.print((i<10)?"  " + i:" " + i);
			if( n %7 == 0) {
				System.out.println();
			}
		}
	}
}
