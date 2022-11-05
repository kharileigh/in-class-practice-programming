/**
 *
 * @author kharileigh
 * <------- MAIN OBJECT TO BE USED IN APPLICATION ------>
 */

package com.kharileigh.studentexception;

import com.kharileigh.studentexception.exceptions.AgeException;
import com.kharileigh.studentexception.exceptions.MarksException;


public class Student {
    
    private int rollNo;
    private String name;
    private int age;
    private int mark; 
    
    // DEFAULT CONSTRUCTOR
    public Student() {
    
    }
    
    //------ CONSTRUCTOR WITH PARAMETERS 
    public Student(int rollNo, String name, int age, int mark) throws AgeException, MarksException {
        this.name = name;
        this.rollNo = rollNo;
        
        // CHECKS AGE
        if (age >= 4 || age <= 18) {
            this.age = age;
        } else {
            throw new AgeException("Age must be between 4-18");  
        } 
        
        // CHECKS MARKS
        if (mark > 0 || mark < 100) {
            this.mark = mark;
        } else {
            throw new MarksException("Marks must be between 0-100");
        }
        
    }

    //----- GETTERS
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
   
    public int getMark() {
        return mark;
    }
    
    
    //----- SETTERS
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    // CHECKS AGE
    public void setAge(int age) throws AgeException {
        if (age >= 4 || age <= 18) {
            this.age = age;
        } else {
            throw new AgeException("Age must be between 4-18");  
        }
    }

    // CHECKS MARKS
    public void setMark(int mark) throws MarksException {
        
        if (mark > 0 || mark < 100) {
            this.mark = mark;
        } else {
            throw new MarksException("Marks must be between 0-100");
        }
    }
    
    // DISPLAY STUDENT OBJECT
    public void displayStudent() {
        System.out.println("NAME : " + name);
        System.out.println("ROLL NUMBER : " + rollNo);
        System.out.println("AGE : " + age);
        System.out.println("MARK : " + mark + " \n");
    }
    

    


}
