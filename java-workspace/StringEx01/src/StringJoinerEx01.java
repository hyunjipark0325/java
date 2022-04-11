import java.util.StringJoiner;

public class StringJoinerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 결합
		String str1 = "사과" + "참외" + "딸기";
		System.out.println(str1);
		
		//concat
		String str2 = "사과".concat("참외").concat("딸기");
		System.out.println( str2);
		
		//format
		String str3 = String.format("%s%s%s", "사과","참외","딸기");
		System.out.println(str3);
		
		//배열의 내용 결합 
		String[] strArr = {"사과","참외","딸기"};
		String str4 = String.format("%s%s%s", strArr[0],strArr[1],strArr[2]);
		System.out.println(str4);
		
		String str5 = String.join(",", strArr); //join - split 의 반대
		System.out.println( str5 );
		
		StringJoiner sj = new StringJoiner(",");
		sj.add("사과");
		sj.add("참외");
		sj.add("수박");
		
		System.out.println(sj);
	}

}
