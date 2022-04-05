package backup;
public class ArrayEx04 {
    //204p
    public static void main(String[]agrs) {
        double[] data = new double[5];

        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;

        // data.length (전체 배열 길이만큼 반복 / 배열을 별도로 초기화하지 않고 선언하면 배열의 요소값은 0으로 초기화)
        for(int i=0; i < data.length; i++){  
        System.out.println(data[i]);
        }
    }    
}
