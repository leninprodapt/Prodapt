import java.util.*;
class Attendence{
	
	void markAttendence(){
		System.out.println("Mass Bunk");
			       }
	void markAttendence(String...s){
		System.out.println(s.length+" "+"Student present");
		
		for(String name:s){
			System.out.println(name);
				} 
}
public static void main(String args[]){
	//Scanner sc=new Scanner (System.in);
	//String s=sc.next();
	Attendence a=new Attendence();
	a.markAttendence("sai");
}}
		
	