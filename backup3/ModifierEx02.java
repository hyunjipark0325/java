// 데이터 은닉
class Student {
  private String studentName;

  //getter 메서드
  public String getStudentName(){
      return studentName;
  }
  //setter 메서드
  public void setStudentName( String studentName ){
      this.studentName = studentName;
  }
}

public class ModifierEx02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentName("홍길동");
        System.out.println(s.getStudentName());
    }
}
