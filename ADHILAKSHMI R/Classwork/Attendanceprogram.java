class Attendanceprogram
{
void markattendance()
{
	System.out.println("mass bunk");
}
void markattendance(String...S)
{
	System.out.println("Number of Student Present : " + S.length);

for(String name:S)
{
	System.out.println(name);
}
}
public static void main(String args[])
{
Attendanceprogram att=new Attendanceprogram();
att.markattendance("pavi","preethi","shiva","nivi");
att.markattendance();
}
}