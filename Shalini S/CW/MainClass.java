import java.util.*;
class Details{
    private String name;
    private int id;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public String toString()
    {
       return id+" "+name; 
    }
}
   




 class MainClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Details arr[]=new Details[4];
        for(int i=0;i<4;i++){
            Details o=new Details();
            System.out.println("Enter the name of the student:");
            o.setName(sc.next());
            System.out.println("Enter the student id:");
            o.setId(sc.nextInt());
            arr[i] = o;
	    
        }
        System.out.println("----------------------------------------------");
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        
    }
}
        