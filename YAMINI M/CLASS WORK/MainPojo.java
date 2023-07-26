import java.util.*;
class MainPojo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  Number of Employees:");
int n=sc.nextInt();

EmployeePojo emp[]=new EmployeePojo[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Employee"+(i+1)+"Employee's Detail:"); 
System.out.println("\n Enter the Employee Id:");
int id=sc.nextInt();
System.out.println("Enter the Employee Name:");
String name=sc.next();
System.out.println("Enter the Employee Salary:");
long salary=sc.nextLong();
EmployeePojo e=new EmployeePojo(id,name,salary);
emp[i]=e;
}
MainPojo employ=new MainPojo();
employ.display(emp);
}
public void display(EmployeePojo...emp)
{
for(EmployeePojo e:emp)
{
System.out.println(e);
}
}
}
