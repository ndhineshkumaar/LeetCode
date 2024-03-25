public class PointsFromCards {
    public static void main(String[] args) {
        int[] cardpoints={1,2,3,4,5,6,1};
        int k=3;
        int[] cardpoints1={2,2,2};
        int k1=2;
        int[] cardpoints2={9,7,7,9,7,7,9};
        int k2=7;
        System.out.println("Example 1"+" "+maxscore(cardpoints,k) );
        System.out.println("Example 2"+" "+maxscore(cardpoints1,k1) );
        System.out.println("Example 3"+" "+maxscore(cardpoints2,k2) );
    }

    public static int maxscore(int[] cardPoints, int k){
        int[] Sum=new int[cardPoints.length];
        int sum=0;
        for(int i=0;i<cardPoints.length;i++){
            sum+=cardPoints[i];
            Sum[i]=sum;
        }
        if(k==cardPoints.length) return sum;
        int score=0,ans=0;
        int i=0,j=cardPoints.length-k-1;
        while(i<=k){
            if(i==0) ans=Sum[j];
            else ans=Sum[j]-Sum[i-1];
            score=Math.max(score, sum-ans);
            i++;
            j++;
        }
        return score;
    }
}
