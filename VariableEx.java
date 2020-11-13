public class VariableEx{
	 
	//below is the class variable totalPercentage
	public static float totalPercentage=100.0f;
	
	// example is the parameter variable
public static void main(String[] example)
{
	//value is the local variable
	float value=89.9f;
	float total=totalPercentage-value;
	System.out.println("remaining is: "+total);
	
	//argument variable with the value in foat is passed to the method argumentCheck
	argumentCheck(57.5f);
	
}
public static void argumentCheck(float test)
{
	
	System.out.println("test value is: "+test);
}
}