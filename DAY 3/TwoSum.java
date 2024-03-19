import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        Map<Integer,Integer> numfreq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numfreq.containsKey(target-nums[i])){
                System.out.println(numfreq.get(target-nums[i])+ " "+i);
            }
            numfreq.put(nums[i], i);
        }
    }
}
