import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(2022-1900, 4-1, 1);
		System.out.println(d.toLocaleString());
		
		
		
		//2022년 12월 25일의 요일 
		
		Date d1 = new Date(2022-1900, 12-1, 25);
		String[] weeks = {"일","월","화","수","목","금","토"};
		System.out.println(d1.getDay());
		System.out.println(weeks[d1.getDay()]);
	}

}
