package March_4;

public class Q88MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;
        int i = m - 1, j = n - 1, k = m + n - 1;
 
        while (i >= 0 && j >= 0) { 
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];  
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--; 
                k--;
            }
        }

        while (i >= 0) {

            nums1[k] = nums1[i];
            k--;
            i--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
        for (int element: nums1) {
            System.out.println(element);
        }
    }
}
