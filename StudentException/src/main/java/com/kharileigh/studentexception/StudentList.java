/**
 *
 * @author kharileigh
 * <-------- ARRAY OF STUDENT OBJECTS -------->
 */

package com.kharileigh.studentexception;

import com.kharileigh.studentexception.exceptions.RollNoException;


public class StudentList {
    
    private Student[] students;
    private int totalStudents;
    
    // CONSTRUCTOR WITH PARAMETER BEING TOTAL OBJECTS IN ARRAY
    public StudentList (int totalStudents) {
        
        super();
        this.totalStudents = totalStudents;
        students = new Student[totalStudents];
    }
    
    
    // INPUTS NEW STUDENT OBJECT INTO ARRAY, CHECKING IF ROLL NO IS ALREADY IN ARRAY
    public void inputStudent(Student student, int index) throws RollNoException {
        
        // IF IN ARRAY, THROW EXCEPTION
        for(int i = 0; i < index; i++) {
            if (students[i].getRollNo() == student.getRollNo()) {
                throw new RollNoException("Duplicate roll number inserted.");
            }
        }
        // IF NOT IN ARRAY, ADD IT TO ARRAY
        students[index] = student; 
    }
    
    // DISPLAYS ALL STUDENTS IN ARRAY
    public void displayStudents() {
        
        for(Student student : students) {
            student.displayStudent();
        }
    
    }
    
    
}
