class Attendance
{
void markattendance()
{
	System.out.println("mass bunk");
}
void markattendance(String...S)
{
	System.out.println(" students present are " +S.length);
	for(String name:S)
	{
	System.out.println(name);
	}
}
	public static void main(String args[])
	{
	Attendance a=new Attendance();
	a.markattendance();
	a.markattendance("kavi","tamil","priya");

}
}