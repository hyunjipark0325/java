
package backup2;
class Student {
    public static int serialNum = 1000;
    public int StudentID;
    public String studentName;
    public int grade;
    public String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }  
    public static void main(String[] args) {
      
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
 }

