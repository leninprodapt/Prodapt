import java.lang.String;
class Attendance 
{ 

/* void markAttendance() 
{ 
System.out.println("NO STUDENTS PRESENT");
} */

void markAttendance(String...s) 
{ 

if(s.length==0) 
System.out.println("NO STUDENTS PRESENT"); 

else 
{ 
System.out.println("No.of Students Present:"+ s.length);
System.out.println("PRESENT Students are:");

for(String name:s) 
{
System.out.println(name);
}
}

}

public static void main(String[]args) 
{ 
Attendance object=new Attendance();
object.markAttendance(); 
object.markAttendance("raghavi","hari","varsha");
}

} 
