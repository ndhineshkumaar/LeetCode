import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> fours=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(fours);
                        while (k<l && nums[k]==nums[k+1] ) k++;
                        while (k<l && nums[l]==nums[l-1] ) l--;
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
