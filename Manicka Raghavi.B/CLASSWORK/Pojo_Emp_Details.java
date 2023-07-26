package pojoclass;
class Pojo_Emp_Details 
{ 
private int id;
private String name; 
private long salary;

void setid(int id)
{ 
this.id=id;
} 

void setname(String name)
{ 
this.name=name;
} 

void setsalary(long salary)
{ 
this.salary=salary;
}

int getid()
{ 
return id;
} 

String setname()
{ 
return name;
} 

long setsalary()
{ 
return salary;
} 

void empdisplay(Pojo_Emp_Details... emparray) 
{ 
for(Pojo_Emp_Details i:emparray) 
{ 
System.out.println(i);
}
}

public String toString()
{ 
return "NAME: "+name+" "+"ID: "+id+" Salary: "+salary;
}

}

