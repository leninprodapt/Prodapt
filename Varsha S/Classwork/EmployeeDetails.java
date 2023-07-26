import java.util.*;
class EmployeeDetails
{
int empid;
String empname;
int empsalary;
EmployeeDetails()
{
}
EmployeeDetails(int empid, String empname, int empsalary)
{
this.empid=empid;
this.empname = empname;
this.empsalary=empsalary;
}
public String toString()
{
return empid + " "+ empname + " " + empsalary;
}
void Employee(EmployeeDetails...emp)
{
for(EmployeeDetails e : emp)
{
System.out.println(e);
}
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("....DETAILS....");
EmployeeDetails a[] = new EmployeeDetails[2];
EmployeeDetails object = new EmployeeDetails();
for(int i=0;i<2;i++)
{
int empid=sc.nextInt();
String empname=sc.next();
int empsalary=sc.nextInt();
EmployeeDetails t=new EmployeeDetails(empid, empname, empsalary); 
a[i]=t;
}

object.Employee(a);
}
}