class VarArg
{
public void m1(int...n)
{
int sum=0;
for(int n1:n)
{
sum=sum+n1;
}
System.out.println("The Sum is:"+sum);
}
public static void main(String args[])
{
VarArg v=new VarArg();
v.m1(10,20,30,40);
}
}