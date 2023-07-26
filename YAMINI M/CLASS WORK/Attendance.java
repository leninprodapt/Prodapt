class Attendance
{
void markAttendance()
{
System.out.println("Mass Bunk");
}
void markAttendance(String...s)
{
System.out.println(s.length+" Students Present:");
for(String name:s)
{
System.out.println(name);
}
}
public static void main(String args[])
{
Attendance file=new Attendance();
file.markAttendance();
file.markAttendance("Yamini","Pooja","Saira","Jovita","Thikshan","Sriram","Krithik","Hema","Sahishnu","Dharshani","Karthik","Divya");
}
}
