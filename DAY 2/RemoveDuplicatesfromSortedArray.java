public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        
        System.out.println(count);
        for(int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
