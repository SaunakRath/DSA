class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    void mergeSort(int[] nums, int left, int right) {

        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);

        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {

                temp[k++] = nums[i++];
            } else {

                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {

            temp[k++] = nums[i++];
        }

        while (j <= right) {

            temp[k++] = nums[j++];
        }

        for (int p = 0; p < temp.length; p++) {

            nums[left + p] = temp[p];
        }
    }
}



//Bubble sort
class Solution {

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}


//Selection Sort
class Solution {

    public int[] sortArray(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (nums[j] < nums[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}

ok
