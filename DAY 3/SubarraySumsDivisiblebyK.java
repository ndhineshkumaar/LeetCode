import java.util.HashMap;

public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            int rem=sum%k;
            if(rem<0) rem+=k;
            if(map.containsKey(rem)) count+=map.get(rem);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        System.out.println(map);
    }
}
