package backup;
public class ArrayEx05 {
    public static void main(String[]args){
        int[] arr1 = {10, 20, 30, 40};

        for( int i=0 ; i <arr1.length ; i++){
         //   System.out.println(arr1[i]);
        }

        //향상된 for문    (for ~ of)
        for( int data : arr1 ){
            System.out.println(data);
        }

        String[] strArr = {"h","e","l","l","o"};
        for(String data : strArr ){
            System.out.println(data);
        }
    }
}
