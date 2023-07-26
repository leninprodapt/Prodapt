package edu;
import java.util.Scanner;
public  class bub_sort{
	int we=123;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the LIST SIZE");
		
		sus v= new sus();
		int r=v.a;
		
		System.out.println(r);
		
		int d=sc.nextInt();
		int n[]=new int[d];
		for(int i=0;i<d;i++){
			n[i]=sc.nextInt();	
			
		}
		int temp;
		for(int i=0;i<d-1;i++){
			for(int j=0;j<d-1;j++){
				if(n[j]>n[j+1]){
					temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
			
			
		}
		for(int i=0;i<d;i++){
			System.out.print(n[i]+" ");
		}
	}
}
class sus{
	int a=12;

	void myFun()
		{
			int j =0;
			
		}

}