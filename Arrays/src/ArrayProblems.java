import java.util.Arrays;


public class ArrayProblems {

    //Find the average of array elements
    public static double findAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        return (double) sum / size;
    }

    //Multiply each element of array with 10
    public static void multiply(int[] arr) {
        for (int i=0; i<arr.length;i++){
            arr[i] *= 10;
        }
    }

    public static boolean linearSearch(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean ans = linearSearch(arr,4);
        System.out.println(ans);


//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Average : " + findAverage(arr));

//        int[] arr = {1, 2, 3, 4, 5};
//        multiply(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
