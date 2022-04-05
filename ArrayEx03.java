public class ArrayEx03 {
    public static void main(String[]agrs) {
        //이차원 배열
        int[][] arr1;
        arr1 = new int[3][2];
        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        System.out.println( arr1[1][0]);
        System.out.println( arr1[2][0]);

        int[][] arr2 = new int[][] {{10, 20},{30, 40},{50, 60}};
        int[][] arr3 = {{10, 20},{30, 40},{50, 60}};

        System.out.println(arr2[0][1]);
        System.out.println(arr3[2][1]);

        
    }
    
}
