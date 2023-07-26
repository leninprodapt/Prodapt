class EmployeePojo
{
int eid;
String eName;
long salary;

EmployeePojo()
{
}
EmployeePojo(int eid,String eName,long salary)
{
this.eid=eid;
this.eName=eName;
this.salary=salary;
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
}
public String getEName()
{
return eName;
}
public void setSalary(long salary)
{
salary=salary;
}
public long getSalary()
{
return salary;
}
public String toString()
{
return eid+""+eName+""+salary;
}
}