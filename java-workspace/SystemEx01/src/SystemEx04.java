
public class SystemEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시스템 설정사항 확인
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		//환경설정
		System.out.println(System.getenv("PATH"));
		System.out.println(System.getenv("JAVA_HOME"));
	}

}
