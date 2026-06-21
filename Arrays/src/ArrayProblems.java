import java.util.Arrays;

//Find the average of array elements
public class ArrayProblems {
    public static double findAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        return (double) sum / size;
    }

    public static void multiply(int[] arr) {
        for (int i=0; i<arr.length;i++){
            arr[i] *= 10;
        }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Average : " + findAverage(arr));

        multiply(arr);
        System.out.println(Arrays.toString(arr));

    }
}
