/* 7.Write code to display elements of an array?
Below is the code to display elements at each index of array named nameOfDress with the count of array. */



public class DressElement{
Public static void main(String[] name)
{
String[] nameOfDress={"Lehenga","Top","Skirt","Saree","Jeans"};
int sizeOfArray=nameOfDress.length;

System.out.println("sizeOfArray :"+sizeOfArray);

// for loop used to diplay each elemts name
for(int start=0;start<sizeOfArray;start++)
{
System.out.println("dress at element index:"+ start);
System.out.println("dress name is: "+ nameOfDress[start]);
}
}
}