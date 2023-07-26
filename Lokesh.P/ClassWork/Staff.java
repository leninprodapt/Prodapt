public class Staff{
    private int eId;
    private String eName;
    private long salary;

    public Staff(int eId, String eName, long salary) {
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

     public long getSalary() {
        return salary;
    }


    public String toString() {
        return "{Staff Id=" + eId +", Staff Name=" + eName +", Staff salary=" + salary + '}';
    }
}
