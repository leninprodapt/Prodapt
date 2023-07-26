import java.util.*;
class Attendence
{
String name;

Attendence(String name)
	{
	this.name = name;
	}
public void Attendencedetails(Attendence... name)
	{
  	System.out.println("Number of students present"+name.length);
  	for(Attendence n:name)
		{
 			System.out.println(n);
		}
	}
public String toString()
	{
		return name;
	}

public static void main(String a[])
	{

		Scanner s=new Scanner(System.in);
		Attendence arr[]=new Attendence[5];

		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the name of the Student");
			String name=s.next();
			Attendence o=new Attendence(name);
			arr[i]=o;

		}

 		arr[1].Attendencedetails(arr);

	}
}
