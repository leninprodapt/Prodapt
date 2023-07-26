import java.util.*;
import java.lang.String; 

class Emparray 
{
 
int eid; 
String name;
int salary;

Emparray() 
{ 

}

Emparray(int eid,String name,int salary) 
{ 
this.eid=eid;
this.name=name;
this.salary=salary;
}

public void empdisplay(Emparray...empdetails) 
{ 
for(Emparray i: empdetails) 
{
System.out.println(i.eid+" "+i.name+" "+i.salary); 
} 
} 

public static void main(String[]args) 
{ 

Scanner sc=new Scanner(System.in);
Emparray empdetails[]=new Emparray[5]; 

for(int i=0;i<5;i++) 

{ 
System.out.println("EMP ID:"); 
int id=sc.nextInt(); 

System.out.println("EMP NAME:"); 
String name=sc.next(); 

System.out.println("EMP SALARY:"); 
int salary=sc.nextInt();

Emparray object=new Emparray(id,name,salary);
empdetails[i]=object;
}
 
Emparray obj=new Emparray();
obj.empdisplay(empdetails); 
}


}