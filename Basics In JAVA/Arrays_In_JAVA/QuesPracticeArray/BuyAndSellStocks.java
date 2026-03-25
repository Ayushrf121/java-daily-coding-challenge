// OK so given a an priceay of the profit at a specific days now based on that find out the maximum 
// profit a person can have in a specific day along with that if there is no profit then simply return zero in that case
package QuesPracticeArray;

public class BuyAndSellStocks {
   public static int MaxProfit(int []price)
   {
    int p=0;
    for(int i=1;i<price.length;i++)
    {
       if(price[i]>price[i-1])
       {
        p+=(price[i]-price[i-1]);
       }
    }
    return p;
   }
    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int m =MaxProfit(price);
        System.out.println("The max profit : "+m);
    }
}
