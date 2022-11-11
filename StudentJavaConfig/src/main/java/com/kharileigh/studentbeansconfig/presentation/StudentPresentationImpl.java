/**
 *
 * @author kharileigh
 */

package com.kharileigh.studentbeansconfig.presentation;

import com.kharileigh.studentbeansconfig.entity.Student;
import com.kharileigh.studentbeansconfig.service.StudentService;
import java.util.Collection;
import java.util.Scanner;


public class StudentPresentationImpl implements StudentPresentation {
    
    private StudentService studentService;
    
    //----- SETTER INJECTION - USED BY CONFIGURATION FILE
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    //----- SHOWS USER THE MENU TO SELECT FROM
    @Override
    public void showMenu() {
        
        System.out.println("===========================");
        System.out.println("STUDENT ROSTER 2022");
        System.out.println("1. List All Students");
        System.out.println("2. Add New Student");
        System.out.println("3. Exit");
        System.out.println("===========================");
    }

    
    // ----- TAKES USER SELECTION - MAKES CALL TO SERVICE LAYER TO HANDLE PROCESSING
    @Override
    public void performMenu(int selection) {
        
        Scanner sc = new Scanner(System.in);
        
        switch(selection) {
        
            // get students from database and put in a collection, then for each one, print to console.
            case 1 :
                    Collection<Student> students = studentService.getAllStudents();
                    
                    for(Student currentStudent : students) {
                        System.out.println(currentStudent);
                    }
                    break;
                    
            // create new Student object, ask user for data to input into properties - call service layer to add new student 
            case 2 :
                    Student newStudent = new Student();
                    
                    System.out.println("Please Enter Student Roll Number : ");
                    newStudent.setRollNo(sc.nextInt());
                    
                    System.out.println("Please Enter Student Name : ");
                    newStudent.setName(sc.next());
                    
                    System.out.println("Please Enter Student Grade : ");
                    newStudent.setGrade(sc.nextInt());
                    
                    
                    // check for duplication in database, if not - add new student
                    if(studentService.addStudent(newStudent)) {
                        System.out.println("Student Add to Class Roster");
                    } else {
                        System.out.println("Student with Roll Number : " + newStudent.getRollNo() + " already exists in Class Roster 2022");
                    }
                    break;
                    
            case 3 :
                    System.out.println("Thanks for utilising the Class Roster today");
                    System.exit(0);
                    
            default :
                    System.out.println("Invalid Selection, please try again");
                    break;
        }
       
    }
    
    
    
}
