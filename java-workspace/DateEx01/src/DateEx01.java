import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.util.Date d = new java.util.Date();
		Date d = new Date();
		System.out.println(d.toString() );
		System.out.println(d.toLocaleString() ); // 한글
		
		//년도 / 월 / 일
		String strDate = d.toLocaleString();
		System.out.println(strDate.substring(0,4));
		System.out.println(strDate.substring(5,7));
		System.out.println(strDate.substring(8,10));
		
		System.out.println(d.getYear()+1900); //년 +1900
		System.out.println(d.getMonth()+1); //월 +1
		System.out.println(d.getDate()); // 일
		System.out.println(d.getHours()); // 시
		System.out.println(d.getMinutes()); // 분
		System.out.println(d.getSeconds()); // 초
		
		System.out.println(d.getDay()); // 요일 0=일요일
	}

}
