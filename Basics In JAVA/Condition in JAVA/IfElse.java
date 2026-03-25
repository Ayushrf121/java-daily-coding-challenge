// income is 5L 0% tax , income b/w 5-10L 20% tax , income>10L 30% tax.

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        float income = sc.nextFloat();
        float tax=0;
        float TaxAmount = 0;
        if(income<500000)
        {
            TaxAmount = tax * income;
        }else if(income>=500000&&income<=1000000)
        {
            tax=0.2f;
            TaxAmount = tax*income;
        }
        else
        {
            tax = 0.3f;
            TaxAmount = tax*income;
        }
        System.out.println("Total amount the employee got : "+(income-TaxAmount));
        sc.close();
    }
}
