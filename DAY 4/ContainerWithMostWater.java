public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=Integer.MIN_VALUE;
        while(i<j){
            int l=Math.min(height[i], height[j]);
            int b=j-i;
            int temp=l*b;
            if(temp>area) area=temp;
            if (height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        System.out.println(area);
    }
}
