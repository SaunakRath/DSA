import java.util.Arrays;


public class ArrayProblems {

//    //Find the average of array elements
//    public static double findAverage(int[] arr){
//        int sum = 0;
//        for (int i : arr){
//            sum += i;
//        }
//        int size = arr.length;
//        return (double) sum / size;
//    }

//    //Multiply each element of array with 10
//    public static void multiply(int[] arr) {
//        for (int i=0; i<arr.length;i++){
//            arr[i] *= 10;
//        }
//    }

//    //Linear search -  search an element in array
//    public static boolean linearSearch(int[] arr, int target){
//        for (int i : arr) {
//            if (i == target) {
//                return true;
//            }
//        }
//        return false;
//    }

    //find max element in array
    public static int maxElement(int[] arr){

        int maxi = arr[0];
        for (int j : arr) {
            if (j > maxi) {
                maxi = j;
            }
        }

        return maxi;
    }


    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxElement(arr));


//        int[] arr = {1, 2, 3, 4, 5};
//        boolean ans = linearSearch(arr,4);
//        System.out.println(ans);


//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Average : " + findAverage(arr));

//        int[] arr = {1, 2, 3, 4, 5};
//        multiply(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
