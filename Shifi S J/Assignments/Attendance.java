class Attendance
{
void MarkAttendance()
{
}
void MarkAttendance(String... s)
{
System.out.println(s.length+ "Students present");
for(String name : s)
{
System.out.println(name);
}
}
public static void main(String a[])

{
Attendance attend=new Attendance();
attend.MarkAttendance("shifi","adhi","bharu");
attend.MarkAttendance();
}
}