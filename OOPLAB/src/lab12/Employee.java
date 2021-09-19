/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;


public class Employee {
    String name;
    int id;
    int salary;

    public Employee() {
    }
    
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: "+ name + "(ID:" + id + ")"+",Income:" + salary;
    }
    
}
