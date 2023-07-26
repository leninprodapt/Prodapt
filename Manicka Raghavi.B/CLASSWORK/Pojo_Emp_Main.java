package pojoclass; 
import java.util.*; 

class Pojo_Emp_Main 
{ 
public static void main(String[]args) 
{
 
Pojo_Emp_Details emparr[]=new Pojo_Emp_Details[5]; 

Pojo_Emp_Details ob=new Pojo_Emp_Details(); 

Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++) 
{ 

Pojo_Emp_Details obj=new Pojo_Emp_Details(); 
System.out.println("EMP ID:"); 
int id=sc.nextInt(); 

System.out.println("EMP NAME:"); 
String name=sc.next(); 

System.out.println("EMP SALARY:"); 
long salary=sc.nextInt(); 

obj.setid(id);
obj.setname(name);
obj.setsalary(salary);

emparr[i]=obj;
} 

ob.empdisplay(emparr);

}

}