import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            int id = sc.nextInt();
            String name = sc.next();
            long salary = sc.nextLong();
            employeeList[i] = new Employee(id,name,salary);
        }
        for(Employee e : employeeList){
            System.out.println(e);
        }
    }
}
