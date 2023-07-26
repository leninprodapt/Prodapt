import java.util.*;
class Mainclass_pojo
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
pojo a[]=new pojo[3];
for (int i=0;i<3;i++)
{
int eid=s.nextInt();
String Name=s.next();
int eSalary=s.nextInt();
pojo m=new pojo();
m.seteid(eid);
m.seteName(Name);
m.seteSalary(eSalary);
a[i]=m;
}
for(pojo g:a)
{
System.out.println(g);
}
}
}





