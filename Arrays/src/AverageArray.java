//Find the average of array elements

public class AverageArray {
    public static double findAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        return (double) sum / size;
    }

    static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Average : " + findAverage(arr));

    }
}
