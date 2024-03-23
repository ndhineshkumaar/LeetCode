import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int z = 0; z < nums.length - 2; z++) {
            if (z > 0 && nums[z] == nums[z - 1]) {
                continue;
            }

            int i = z + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[z] + nums[i] + nums[j] == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[z]);
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    ans.add(triplet);
                    while(i<j && nums[i]==nums[i+1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j-1]){
                        j--;
                    }
                    i++;
                    j--;
                } else if (nums[z] + nums[i] + nums[j] < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(ans);
        
    }
}
