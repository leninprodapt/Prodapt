public class Employee{
    private int eId;
    private String eName;
    private long salary;

    public Employee(int eId, String eName, long salary) {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    public int getEId() {
        return eId;
    }

    public void setEId(int eId) {
        this.eId = eId;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{employee Id=" + eId +", employee Name='" + eName +", employee salary=" + salary + '}';
    }
}
