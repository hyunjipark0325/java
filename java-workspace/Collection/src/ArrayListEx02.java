import java.util.List;
import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		
		System.out.println(al.toString());
		
		System.out.println(al.indexOf("2")); //이 목록에서 지정된 요소가 처음으로 나타나는 인덱스를 반환하거나 이 목록에 요소가 없으면 -1을 반환합니다.
		System.out.println(al.lastIndexOf("3"));
		System.out.println(al.indexOf("0"));
		
		System.out.println(al.contains("3")); // 이 목록에서 지정된 요소가 존재하는지 
		System.out.println(al.contains("0"));
		
		List subal = al.subList(1, 4);
				System.out.println( subal.toString());
	}

}
