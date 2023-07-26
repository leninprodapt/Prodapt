class Employee
{
int eid;
String eName;
long salary;
Employee()
{
}
Employee(int eid,String eName,long salary)
{
this.eid=eid;
this eName=eName;
this salary=salary;
}
public String toString()
{
return eid+""+eName+""+Salary;
}
public void setEid(int id)
{
eid=id;
}
public int getEid()
{
return eid;
}
public void setEName(String name)
{
eName=name;
public String getEName()
{
return eName;
}
public void EmpDetails(Employee...emp)
{
for(Employee e:emp)
{
System.out.println(e);
}
}