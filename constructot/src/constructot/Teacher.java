/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructot;

/**
 *
 * @author Shaeakh
 */
public class Teacher {
    
    String name;
    String gender;
    int age;
    
    Teacher(String n,String g,int a){
        name = n;
        gender = g;
        age = a;
    }
    void display(){
    System.out.println("Name : "+name);
    System.out.println("Gender : "+gender);
    System.out.println("Age : "+age);
    }
    
}
