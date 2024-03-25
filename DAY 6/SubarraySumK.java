import java.util.*;

public class SubarraySumK {
public static void main(String[] args) {
    int[] arr={1,1,1};
    int k=2;
    int[] arr1={1,2,3};
    int k1=3;

    System.out.println(subarraySum(arr,k));
    System.out.println(subarraySum(arr1,k1));
}

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            int diff=sum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
