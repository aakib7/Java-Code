/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8b;

/**
 *
 * @author aaqib
 */
public abstract class Employee {
    private String frisrName;
    private String lastName;
    private String SSN;
    private Date DOB;

    public Employee(String frisrName, String lastName, String SSN, Date DOB) {
        this.frisrName = frisrName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.DOB = DOB;
    }

    public Date getDate() {
        return DOB;
    }

    public void setDate(Date DOB) {
        this.DOB = DOB;
    }


    public String getFrisrName() {
        return frisrName;
    }

    public void setFrisrName(String frisrName) {
        this.frisrName = frisrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" + "frisrName=" + frisrName + ", lastName=" + lastName + ", SSN=" + SSN + ", " + DOB + '}';
    }
}
