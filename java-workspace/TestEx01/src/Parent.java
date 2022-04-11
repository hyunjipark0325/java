
public class Parent {
	private String name;
	private int age;
	
	//디폴트 생성자
	public Parent() {
		System.out.println("Parent() 호출");
	}
	// 중복정의된 생성자
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 }
