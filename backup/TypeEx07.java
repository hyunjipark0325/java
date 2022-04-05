package backup;
public class TypeEx07 {
    public static void main(String[] args){
        //진수
        int i2 = 0b1010;  //2진수를 10진수로 
        int i8 = 030;     //8진수를 10진수로 
        int i16 = 0xA4;   //16진수를 10진수로 

        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        int i10 = 100;
        System.out.printf( "%o\n", i10);;
        System.out.printf( "%x\n", i10);;



    }
    
}
