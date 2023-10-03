package composition;

/**
 *
 * @author 20024094
 */

public class Job {
    
    private String role;
    private double salary;
    private int id;
    
    public Job() {
        
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
}
