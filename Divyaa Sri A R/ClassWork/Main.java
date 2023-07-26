import java.util.Scanner;
public class Main
{
public static void main(String a[])
	{
		
		Scanner s = new Scanner(System.in);
		StudentDetails studentd[] = new StudentDetails[5];
		
		for(int i=0;i<3;i++)
		{	
			StudentDetails studentarr = new StudentDetails();
			System.out.println("Enter the Student ID");
			
			studentarr.setId(s.nextInt());
			System.out.println("Enter the Student Name");
			
			studentarr.setName(s.next());
			System.out.println("Enter the Student Marks");
			
			studentarr.setMark(s.nextInt());
			studentd[i] = studentarr;
		}
		
		
		StudentDetails studentarr1 = new StudentDetails();
		System.out.println("*****************");
		studentarr1.studentDet(studentd[0]);
		System.out.println("*****************");
		studentarr1.studentDet(studentd[0],studentd[1]);
		
		
	}
	
	
}