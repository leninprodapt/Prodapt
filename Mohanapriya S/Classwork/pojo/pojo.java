
class pojo
{
private int eid;
private String eName;
private int eSalary;

public void seteid(int id)
{
eid=id;
}
public int geteid()
{
return eid;
}
public void seteName(String Name)
{
eName=Name;
}
public String geteName()
{
return eName;
}
public void seteSalary(int salary)
{
eSalary=salary;
}
public int eSalary()
{
return eSalary;
}
public String toString()
{
return eid+" "+eName+" "+eSalary;
}
}
