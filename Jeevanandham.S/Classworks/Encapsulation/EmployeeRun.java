package Encapsulation;
class EmployeeRun{
	public static void main(String[] args){
		Employee e = new Employee(120,"Ram", 300000);
		System.out.println("---------Parameterized constructor input--------");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSalary());
		e.setEmpId(121);
		e.setEmpName("Jeeva");
		e.setEmpSalary(400000);
		System.out.println("---------Getter setter input--------");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSalary());
		System.out.println("---------Printing the output by object--------");
		System.out.println(e);
		Employee e1 = new Employee(121,"Raj",300000);
		System.out.println("---------Passing reference of object e--------");
		e1.getDetails(e);
		System.out.println("---------Passing reference of object e1--------");
		e1.getDetails(e1);
		
	}
}