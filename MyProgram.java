public class MyProgram
{
    public static void main(String[] args)
    {
      TopBillionaires topbillionaires = new TopBillionaires();
      topbillionaires.collectBillionaires();
      Billionaires top = topbillionaires.Information();
      System.out.println("The richest billionaires in the world is " + top.getName() );
    }
}