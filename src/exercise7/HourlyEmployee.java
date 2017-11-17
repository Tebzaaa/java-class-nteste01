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
public class HourlyEmployee extends Employee {
    private Double wageRate;
    private Double hours;
    
    public HourlyEmployee(String name, String ssn, Double wageRate, Double hours){
        super( name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
        
    }

    public Double getWageRate() {
        return wageRate;
    }

    public Double getHours() {
        return hours;
    }

    public void setWageRate(Double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }
    public void printWeeklyCheck(){
        System.out.println("The weekly check for"+name+"is"+(wageRate * hours));
    }
    
}
   