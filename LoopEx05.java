public class LoopEx05 {
    public static void main(String[]args) {
        for(int dan = 0 ; dan<=9 ; dan++){
            for(int col = 65; col <=65+dan; col++){
                System.out.print((char)col); 
            }
            System.out.println();
        }
            
    }
}


