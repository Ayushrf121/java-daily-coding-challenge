package Classes_Objects;
public class A{
    public static void main(String [] args)
    {
       Account SBI = new Account();
    //    SBI.acc = "SBI24151113@DDN";
          SBI.setAcc("SBI24151113@DDN");
          SBI.setBal(45000.88f);
       Account HDFC = new Account();
          HDFC.setAcc("HDFC24151114@DDN");
          HDFC.setBal(85000.8f);
          System.out.println("Account No.: "+SBI.acc+"\nBalance: "+SBI.bal);
          System.out.println("Account No.: "+HDFC.acc+"\nBalance: "+HDFC.bal);
    }
}

// Account class
class Account
{
    String acc;
    float bal;

    void setBal(float b)
    {
        bal = b;
    }
    void setAcc(String a)
    {
        acc = a;
    }
}
