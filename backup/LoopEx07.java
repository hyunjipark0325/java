package backup;
public class LoopEx07 {
    public static void main(String[] args) {
        for(int i=0; i<4; i++ ){
            for(int j=0; j<3-i; j++){
                System.out.print(" ");
            }for(int j=0; j<2*i+1; j++){
                System.out.print('*');
            }
        System.out.println();  
        }
        for(int i=0; i<3; i++ ){
            for(int j=0; j<1+i; j++){
                System.out.print(" ");
            }for(int j=5; j>2*i; j--){
            System.out.print('*');
        }
        System.out.println(); 
        } 
    }
}