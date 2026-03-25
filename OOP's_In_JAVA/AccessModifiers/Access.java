public class Access {
    public static void main(String[] args) {
        Pen P1 = new Pen();
        P1.setName("Parker");
        P1.setTip(5);
        Pen P2 = new Pen();
        P2.setName("Rorito");
        P2.setTip(3);
        // System.out.println(P1.name + " " + P1.tip);
        // System.out.println(P2.name + " " + P2.tip); At this point we use the getters.
        System.out.println(P1.getName() + " " + P1.getTip());
        System.out.println(P2.getName() + " " + P2.getTip());
    }    
}
 
class Pen
{
    String name;
    private int tip;
    // Getter & Setter.....
    void setTip(int tip)
    {
        this.tip = tip;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
    int getTip()
    {
        return this.tip;
    }
}
