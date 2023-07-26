import java.util.*;
import java.lang.String; 

class Emp_Array 
{
 
int eid; 
String name;
int salary;

Emp_Array() 
{ 

}

Emp_Array(int eid,String name,int salary) 
{ 
this.eid=eid;
this.name=name;
this.salary=salary;
}

public void empdisplay(Emp_Array...empdetails) 
{ 
for(Emp_Array i: empdetails) 
{
System.out.println(i.eid+" "+i.name+" "+i.salary); 
} 
} 

public static void main(String[]args) 
{ 

Scanner sc=new Scanner(System.in);
Emp_Array empdetails[]=new Emp_Array[5]; 

for(int i=0;i<5;i++) 

{ 
System.out.println("EMP ID:"); 
int id=sc.nextInt(); 

System.out.println("EMP NAME:"); 
String name=sc.next(); 

System.out.println("EMP SALARY:"); 
int salary=sc.nextInt();

Emp_Array object=new Emp_Array(id,name,salary);
empdetails[i]=object;
}
 
Emp_Array obj=new Emp_Array();
obj.empdisplay(empdetails); 
}


}