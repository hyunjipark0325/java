// 데이터 은닉
class MyDate { 
  private int day;
  private int month;
  private int year;


  //getter 메서드
  public int getDay(){
      return day;
  }
  //setter 메서드
  public void setDay( int day ){
      this.day = day;
    }
}

public class ModifierEx03 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentName("홍길동");
        System.out.println(s.getStudentName());
    }
}
