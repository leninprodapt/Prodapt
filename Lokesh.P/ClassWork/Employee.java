public class Employee{
    private int eId;
    private String eName;
    private long salary;

    public Employee(int eId, String eName, long salary) {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    public void setEId(int eId) {
        this.eId = eId;
    }

    public int getEId() {
        return eId;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public String getEName() {
        return eName;
    }




    public void setSalary(long salary) {
        this.salary = salary;
    }


    public String toString() {
        return "{employee Id=" + eId +", employee Name='" + eName +", employee salary=" + salary + '}';
    }
}