package backup2;

//157p
class Person{
    String name;
    float height;
    float weight;
    
    public Person(){}

    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class ConstructorEx03 {
    public static void main(String[] args) {
     Person personKim = new Person();
     personKim.name = "김유신";
     personKim.height = 180.0F;
     personKim.weight = 85.5F;

     Person personLee = new Person("이순신", 175, 75);
     System.out.println(personLee.name);
    }
}
