import java.util.Scanner;
class StudentDetailsClass
{
	String id;
	String name;
	String mark;
StudentDetailsClass(){}
StudentDetailsClass(String id,String name,String mark)
{
this.id=id;
this.name=name;
this.mark=mark;
}
public String toString()
{
return id+" \t"+name+" \t"+mark;
}
public void studentDetails(StudentDetailsClass... details)
	{
		for(StudentDetailsClass d:details)
		{
			System.out.println(d);
		}
}
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		StudentDetailsClass studentDetails[] = new StudentDetailsClass[3];
		for(int i=0;i<3;i++)
		{	
			System.out.println("Enter the Student ID");
			String sid = s.next();
			System.out.println("Enter the Student Name");
			String sName = s.next();
			System.out.println("Enter the Student Marks");
			String marks = s.next();

			StudentDetailsClass student = new StudentDetailsClass(sid,sName,marks);
			
			studentDetails[i] = student;
		}
		
		
		
		StudentDetailsClass studentarr = new StudentDetailsClass();
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetails[0]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetails[0],studentDetails[1]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetails);
		
	}
	
	
}















