// Find the Binomial Coefficient.
public class Func3 {
    public static float Facto(float val)
    {
        float F = 1;
        for(int i=1;i<=val;i++)
        {
            F*=i;
        }
        return F;
    }
    public static float Binomial(float n,float r)
    {
        
        Float nFacto = Facto(n);
        Float rFacto = Facto(r);
        Float nrFacto = Facto(n-r);
        return (nFacto/(rFacto)*(nrFacto));

    }
    public static void main(String[] args) {
        float bc = Binomial(5,2);
        System.out.println(bc);
    }
}
