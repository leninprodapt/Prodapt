import java.util.*;
class StudentAttendance
{
void Att(String... s)
{
System.out.println(s.length+" student present");
for(String n : s)
{
System.out.println(n);
}
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2=sc.next();
StudentAttendance a = new StudentAttendance();
a.Att(s1,s2);
}
}