import java.io.IOException;

public class ProcessBuilderEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//윈도우 내에 프로그램 실행
		//"C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe"
		
		ProcessBuilder processBuilder
		//= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "www.naver.com");
		= new ProcessBuilder ("c:\\Windows\\system32\\notepad.exe");
		
		processBuilder.start();
	}

}
