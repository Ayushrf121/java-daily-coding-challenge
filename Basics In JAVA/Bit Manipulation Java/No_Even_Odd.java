public class No_Even_Odd {
    public static void main(String[] args) {
        int x = 0;
        
        int r = x & 1;
        if(r==1)
        {
            System.out.println(x +" is "+"odd" );
        }
        else
            {
            System.out.println(x +" is "+"even" );
        }
    }
}
