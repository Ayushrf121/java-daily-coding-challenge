import java.util.Arrays;

public class IndianCoin {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int amount =1550;
        Arrays.sort(coins);
        for (int i = 0; i < coins.length/2; i++) {
            int l = coins[coins.length-i-1];
            coins[coins.length-i-1] = coins[i];
            coins[i] = l; 
        }
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amount){
                while (coins[i]<=amount) {
                    count++;
                    amount -=coins[i]; 
                }
            }
        }
        if(amount==0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}
