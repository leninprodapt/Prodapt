package PracticePackage.VarArg;

import java.util.Scanner;
class EmpMainClass
{
	public static void main(String agrs[])


	{
		Scanner sc = new Scanner(System.in);
		EmployeeDetails emp[] = new EmployeeDetails[3];
		for (int i=0;i<3;i++)
		{
		EmployeeDetails e = new EmployeeDetails();
		
		System.out.println("Enter Employee ID");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name");
		e.setEname(sc.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextInt());
		emp[i]=e;
		}

		for(EmployeeDetails a : emp)
		{
			System.out.println(a);
		}
	}
}


	