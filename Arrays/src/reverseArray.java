public class reverseArray {
    static void reversearr(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int k:arr){
            System.out.println(k);
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        reversearr(arr);
    }
}
