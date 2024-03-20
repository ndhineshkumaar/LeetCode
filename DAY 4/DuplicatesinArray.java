import java.util.*;

public class DuplicatesinArray {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i: freq.keySet()){
            if(freq.get(i)>1) ans.add(i);
        }
        System.out.println(ans);
    }
}
