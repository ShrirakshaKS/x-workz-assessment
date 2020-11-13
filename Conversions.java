/*3.Write example to convert string to primitive(8)
 We can convert String to primitive using parse method in java
 */
 
public class Conversions
{
public static void main(String[] converter)
{
String numberOfDaysInWeek="7";
byte day=Byte.parseByte(numberOfDaysInWeek);
System.out.println(day);

String numberOfDaysInYear="365";
short days=Short.parseShort(numberOfDaysInYear);
System.out.println(days);

String salary="35000";
int intConverter=Integer.parseInt(salary);
System.out.println(intConverter);

String populationOfIndia="13526875";
long longConverter=Long.parseLong(populationOfIndia);
System.out.println(longConverter);

String percentage="74.8f";
float floatConverter=Float.parseFloat(percentage);
System.out.println(floatConverter);

String valueOfPI="3.1425289d";
double doubleConverter=Double.parseDouble(valueOfPI);
System.out.println(doubleConverter);

String sunIsStar="true";
boolean booleanConverter=Boolean.parseBoolean(sunIsStar);
System.out.println(booleanConverter);

//String numberOfDaysInWeek="7";

}
}