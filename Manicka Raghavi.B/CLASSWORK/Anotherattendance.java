import java.util.*;
import java.lang.String;
class Anotherattendance 
{  

String name;
int id;
int mark;

Anotherattendance() 
{ }

Anotherattendance(String name,int id,int mark) 
{ 
this.name=name;
this.id=id;
this.mark=mark;
}

void markAttendance(String...s) 
{ 
 
System.out.println("No.of Students Present:"+ s.length);
System.out.println("PRESENT Students are:");
for(String name:s) 
{
System.out.println(name);
}
}

public String toString() 
{ 
return "STUDENT ID: " +id+" STUDENT NAME: "+name+" STUDENT MARK: "+mark;
}

public static void main(String[]args) 
{  

Anotherattendance object=new Anotherattendance();
String string[]=new String[5];
Scanner sc=new Scanner(System.in); 

System.out.println("Info regarding students"); 

for(int i=0;i<5;i++) 
{ 
System.out.println("STUDENT ID:"); 
int id=sc.nextInt(); 

System.out.println("STUDENT NAME:"); 
String name=sc.next();

System.out.println("STUDENT MARK:"); 
int mark=sc.nextInt(); 

Anotherattendance obj=new Anotherattendance(name,id,mark); 
string[i]=obj.toString();
} 
object.markAttendance(string);
}
}