public class shiftOne {
    static void shiftByOne(int[] arr){
        //step1:last value ko store karo temp me
        int n = arr.length;
        int temp = arr[n-1];
        //step2: shift all values of array
        for (int i=n-1; i>0;i--){
            arr[i]=arr[i-1];
        }
        //step3: temp ki value 0 index pe store karo
        arr[0] = temp;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};
        shiftByOne(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
