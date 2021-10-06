import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;
    }
    public void quicksort(int[] nums, int l, int h) {
        if (l < h) {
            int pi = partition(nums, l, h);
            quicksort(nums, l, pi-1);
            quicksort(nums, pi+1, h);
        }
    }
    public int partition(int nums[], int l, int h) {
        int pivot = nums[h];
        int i = l-1;
        for (int j = l; j <= h; j++) {
            if (comparator(nums[j], pivot) == 0) {
                if (nums[j] < pivot) {
                    i++;
                    swap(nums, i, j);
                }
            } else if (comparator(nums[j], pivot) == -1) {
                i++;
                swap(nums, i, j);
            } else {
                continue;
            }
        }
        swap(nums, i+1, h);
        return i+1;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int comparator(int a, int b) {
        if (Integer.bitCount(a) == Integer.bitCount(b)) return 0;
        return Integer.bitCount(a) < Integer.bitCount(b) ? -1: 1; 
    }
}
