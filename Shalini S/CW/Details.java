import java.util.*;
class Details{
    String s_name;
    int s_id;
    Details(String s_name,int s_id){
        this.s_name=s_name;
        this.s_id=s_id;
    }

    void show_details(Details... d){
        System.out.println("The student details are:");
        for(Details i:d){
            System.out.println(i);
        }
    }

    public String toString()
    {
       return s_id+" "+s_name; 
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Details arr[]=new Details[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter the name of the student:");
            String a =sc.next();
            System.out.println("Enter the student id:");
            int b=sc.nextInt();
       
            Details s1= new Details(a,b);
	    //s1.str=a;
	    //s1.i=b;
            arr[i]=s1;
        }
        System.out.println("----------------------------------------------");
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}
        