public class Payment
{
	private static String scanCode="PhoneNumber";
	
	public static String getScanCode()
	{
		return scanCode;
	}	
	public static void setScanCode(String newCode)
	{
		if( newCode.equals("QR_Code") || newCode.equals("Account_Number") )
		{
			System.out.println("payment method is: " + newCode);
			scanCode=newCode;
		}
		else {
			System.out.println("It is not the way to make payment");
		}
	}
}