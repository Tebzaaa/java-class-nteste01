/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author nteste01
 */
public class SalariedEmployee extends Employee {
    private Double salary;
    
    public SalariedEmployee(Double salary, String ssn, String name){
        super(ssn, name);
        this.salary = salary;
        
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void printWeeklyCheck() {
        System.out.println("The weekly check for teh salaried employee is"+(1/52 * salary));
    }
    
}
