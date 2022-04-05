public class LoopEx02 {
    public static void main(String[]args) {
        
        for(int dan = 2 ; dan<=9 ; dan++){
            if(dan%2==0){
            for(int col = 1; col <=9; col++){
                System.out.println(dan+"X"+col+"="+dan*col); 
                }
            }else{}
            System.out.println();
        }
    }
    
}
