import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList(); //ArrayList라는 저장형식을 만들다
		ArrayList al2 = new ArrayList(100);
		
		String data1 = "박문수";
		String data2 = "이몽룡";
		
		// 자동형변환 묵시적
		al1.add(data1);
		al1.add((Object)data2);
		
		System.out.println( al1.size() );
		System.out.println( al1.toString() );
		
		al1.add("임꺽정");
		System.out.println(al1.toString() );
		
		//String data = (String)al1.get(0);
		//System.out.println(data);
		
		for( int i = 0 ; i<al1.size(); i++) {
			String data = (String)al1.get(i);
					System.out.println(data);
		}
		
		//향상된 for문 
		for(Object obj : al1) {
			String data = (String)obj;
			System.out.println("데이터 :"+data);
		}
		
		al1.add(2, "성춘향"); //추가 
		System.out.println(al1.toString());
		
		al1.set(0, "방자"); //변경하기
		System.out.println(al1.toString());
		
		al1.remove(0); //지우기
		System.out.println(al1.toString());
		
		al1.clear(); //제거
		System.out.println(al1.toString());
		
	}

}
