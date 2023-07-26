import java.util.Scanner;
class classroom{
	public void attendance(School...arr){
			System.out.println(arr.length+" students are present");
			for(School ar:arr){
				System.out.println(ar);
	}
			
}	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		School arr[]=new School[4];
		for(int i=0;i<3;i++){
			School su= new School();
			System.out.println("Enter students name");
			su.setsName(sc.next());
			System.out.println("Enter students id");
			su.setsId(sc.nextInt());
			//School v=new School(sname,setsId);
			arr[i]=su;
			
		}
		classroom cs=new classroom();
		cs.attendance(arr);
		
	}
}