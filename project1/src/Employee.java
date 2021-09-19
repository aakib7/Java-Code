/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Employee extends Information { 

    public Employee() {
    }
    
   
    private String post;
    private double salary;
    private int type;
    private int hour;
    private double hoursalary;
    private int id;

    public Employee(String post, double salary, int type, int hour, double hoursalary, String name, String phone, Address address, String gender, boolean status,int id) {
        super(name, phone, address, gender, status);
        this.post = post;
        this.salary = salary;
        this.type = type;
        this.hour = hour;
        this.hoursalary = hoursalary;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setI(int id) {
        this.id = id;
    }
    

    

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getHoursalary() {
        return hoursalary;
    }

    public void setHoursalary(double hoursalary) {
        this.hoursalary = hoursalary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    public double calculateSalary(){
    double s=0;
    if(type==1){
    s=getSalary();}
    else if(type==2){
    s=getHour()*getHoursalary();}
    return s;}
   
   
    
        }
    
    
    
    
   
    
    
    