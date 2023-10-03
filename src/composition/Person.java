package composition;

/**
 *
 * @author 20024094
 */

public class Person {
    
    // composition has a relationship
    Job job = new Job();
    
    public Person() {
        job.setSalary(2000.0);
    }
    
    public double getSalary() {
        return job.getSalary();
    }
    
}
