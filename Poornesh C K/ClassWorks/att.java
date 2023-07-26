import java.util.Scanner;
class att{
	String name;
	
	att(){
	}
	att(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	public void atted(att...a){
		System.out.println("Number of students present is"+(a.length));
		for(att as:a){
			System.out.println(as);
		}
	}
	
	public static void main(String args[]){
		//att ob =new att[5];
		att stor[]=new att[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			
			String name=sc.next();
			att uv = new att(name);
			stor[i]=uv;
		}
		att ws = new att();
		ws.atted(stor);
		
	
	}

}