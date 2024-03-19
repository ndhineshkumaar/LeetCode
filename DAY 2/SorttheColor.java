public class SorttheColor {
    public static void main(String[] args) {
    // Dutch National Flag Approach
    int[] nums={2,0,2,1,1,0};
    // for (int i=1;i<nums.length;i++){
    //     int key=nums[i];
    //     int j=i-1;
    //     while(j>=0 && nums[j]>key){
    //         nums[j+1]=nums[j];
    //         j--;
    //     }
    //     nums[j+1]=key;
    // }
    // for (int i:nums) System.out.print(i+" ");

        int start = 0, mid = 0, last = nums.length - 1;
        while (mid <= last) {
            if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp;
                last--;
            } else if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }
        }
        for (int i:nums) System.out.print(i+" ");

    }
}
