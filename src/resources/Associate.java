/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author Ethan
 */
public class Associate extends Employee{
    
    static int monthlySalary = 30000;
    public Associate(int id, String fname, String lname, String pos, String projTitle, String projType) {
        super(id, monthlySalary, fname, lname, pos, projTitle, projType);
    }
    
    public double calculateSalary() {
        double salary = monthlySalary - monthlyTax - sss - philHealth - pagIbig;
        return salary;
    }
    
}
