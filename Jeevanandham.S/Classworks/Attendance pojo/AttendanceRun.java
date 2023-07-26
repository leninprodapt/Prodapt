import java.util.Scanner;
class AttendanceRun
{

	

	public void markAttendance(Attendance...arr)
	{
		System.out.println(arr.length+" students are present");
		for(Attendance name:arr)
		{
			System.out.println(name);
		}
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Attendance[] arr = new Attendance[3];
		Attendance a = new Attendance();
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Enter the name");
			a.setName(sc.next());
			System.out.println("Enter the ID");
			a.setId(sc.nextInt());
			arr.add(a);		
		}
		
		AttendanceRun a1 = new AttendanceRun();
		a1.markAttendance(arr);
		
		
	}
}