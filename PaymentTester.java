public class PaymentTester
{
	public static void main(String[] pay)
	{
	System.out.println("JVM invokes main method");
	
	
	System.out.println("payment method is:" + Payment.getScanCode());
	Payment.setScanCode(pay[0]);
	String scan=Payment.getScanCode();
	System.out.println("payment method is:" + scan);
	
	System.out.println("Exit main method");
	}
}