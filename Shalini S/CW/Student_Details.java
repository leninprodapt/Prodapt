import java.util.*;
class Student_Details{
    String s_name;
    int s_id;
    Student_Details(String s_name,int s_id){
        this.s_name=s_name;
        this.s_id=s_id;
    }
    public String toString()
    {
       return s_id+" "+s_name; 
    }

    void show_details(Student_Details... details){
        System.out.println("The student details are:");
        for(Student_Details i:details){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	String a;
	int b;
        System.out.println("Enter the name of the student:");
        a =sc.next();
        System.out.println("Enter the student id:");
        b=sc.nextInt();

        Student_Details s1= new Student_Details(a,b);
	//s1.str=a;
	//s1.i=b;
        s1.show_details(s1);
    }
}
        