public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int buy=prices[0];
        int currentpro=0;
        int maxpro=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy) buy=prices[i];
            if(prices[i]>buy) currentpro=prices[i]-buy;
            if (currentpro>maxpro) maxpro=currentpro;
        }
        System.out.println(maxpro);
    }
}
