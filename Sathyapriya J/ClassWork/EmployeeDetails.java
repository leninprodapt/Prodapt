package PracticePackage.VarArg;

import java.util.*;


public class EmployeeDetails{
	private int eid;
	private String ename;
	private int salary;
	
	EmployeeDetails()
	{
		eid = 0 ;
		ename = null ;
		salary = 0;
	}

	public void setEid(int id)
	{
		eid = id;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String name)
	{
		ename = name;
	}
	
	public String getEname()
	{
		return ename;
	}

	public void setSalary(int sal)
	{
		salary = sal;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	
	public String toString()
	{
		return eid+" "+ename+" "+salary;
	}
	



}
	