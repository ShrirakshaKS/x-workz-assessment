public class ClinicalTest
{
	public static void main(String[] check)
	{
		System.out.println("JVM invokes main");
		String doctor="Dr. Manjunath";
		Clinic.operation(doctor);
		Clinic.operation(100);
		Clinic.operation(doctor,11);
		System.out.println("exit from main");
	}
}