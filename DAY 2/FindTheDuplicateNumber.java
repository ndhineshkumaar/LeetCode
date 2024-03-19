public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={3,3,3,3,3};
        int[] freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>1){
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
