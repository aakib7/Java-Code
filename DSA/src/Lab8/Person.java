/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class Person {
    private int id;
    private int age;
    private String name;
Scanner scan=new Scanner(System.in);
    public Person() {
    }

    public Person(int id, int age, String name) {
        
        this.id = id;
        this.age = age;
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }
    
    public void input(){
     
        System.out.println("Enter person name:");
        setName(scan.nextLine());
        System.out.println("Enter id:");
        setId(scan.nextInt());
        System.out.println("Enter age;");
        setAge(scan.nextInt());
    }
    
    
}
