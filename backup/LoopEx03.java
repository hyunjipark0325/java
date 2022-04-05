package backup;
public class LoopEx03 {
    public static void main(String[]args) {
        for(int dan = 2 ; dan<=9 ; dan++){
            if(dan%2==0){
            for(int col = 1; col <=9; col++){
                System.out.print(dan+"X"+col+"="+(dan*col)+"     "); // 가로정렬
                }
                System.out.println();
            }
            // System.out.println();  요기에 쓰면 사이에 엔터 효과
        }
    }
}

