/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author aaqib
 */
public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private double cGpa;

    public Student(String name, int id, double cGpa) {
        this.name = name;
        this.id = id;
        this.cGpa = cGpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getcGpa() {
        return cGpa;
    }

    public void setcGpa(double cGpa) {
        this.cGpa = cGpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", cGpa=" + cGpa + '}';
    }
    
    public int CompareTo(Student st){
        return 0;
    }

    @Override
    public int compareTo(Student student) {
        if(this.getcGpa()>student.getcGpa()){
        return -1;}
        
        else if(this.getcGpa()<student.getcGpa()){
        return 1;}
        else{
        return 0;}
           }
    
}
