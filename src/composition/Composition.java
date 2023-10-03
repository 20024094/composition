package composition;

/**
 *
 * @author 20024094
 */

/*
* Author: Daniel Barbu: 20024094
* Application: Keyboard
* Version: 1.0
* Date: 03/10/2023
*/

public class Composition {
   
    public static void main(String[] args) {
        Person person = new Person();
        double salary = person.getSalary();
        System.out.println("Your salary is: " + salary);
    }
    
}
