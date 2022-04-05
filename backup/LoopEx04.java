package backup;
public class LoopEx04 {
    public static void main(String[]args) {
        for(int dan = 0 ; dan<=10 ; dan++){
            for(int col = 0; col <=9-dan; col++){
                System.out.print("*"); 
            }
            System.out.println();
        }
            
    }
}


