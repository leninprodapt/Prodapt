import java.util.*;
class SingleAttendance
{
void MarkAttendance()
{
System.out.println("Bunk");
}


void MarkAttendance(String... s)
{
System.out.println(s.length+" student present");
for(String n : s)
{
System.out.println(n);
}
}

public static void main(String args[])
{
SingleAttendance a = new SingleAttendance();
a.MarkAttendance("Varshaaaaaaaaa");
}
}