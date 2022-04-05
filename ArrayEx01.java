public class ArrayEx01 {
    public static void main(String[]agrs) {
        //배열선언
        int[] arr1;
        int arr2[];

        //배열생성
        arr1 = new int[5];
        arr2 = new int[3];

        //배열의 초기화
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println(arr2); // 주소 참조값
        System.out.println(arr1[0]);
        System.out.println(arr1[4]);

        
    }
    
}
