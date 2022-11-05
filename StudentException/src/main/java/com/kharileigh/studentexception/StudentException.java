/**
 *
 * @author kharileigh
 * <------- TO FIX : currently checking roll no after completion of new object ------>
 */

package com.kharileigh.studentexception;

import com.kharileigh.studentexception.exceptions.AgeException;
import com.kharileigh.studentexception.exceptions.MarksException;
import com.kharileigh.studentexception.exceptions.RollNoException;
import java.util.Scanner;

public class StudentException {

    public static void main(String[] args) {
       
        
        // SCANNER TO GET USER INPUT
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("How many students are in this class?");
            int totalNumStudents = sc.nextInt();
            
            // STUDENT LIST CONSTRUCTOR TO SET TOTAL NUMBER OF STUDENTS IN ARRAY
            StudentList students = new StudentList(totalNumStudents);
            
            System.out.println("PLEASE ENTER THE FOLLOWING STUDENT DETAILS");
            System.out.println("===========================================");
            
            // FOR LOOP TO SAVE EACH STUDENT TO ARRAY
            for (int i = 0; i < totalNumStudents; i++) {
                
                // create new student with details from user
                Student student = new Student();
            
                System.out.println("\n STUDENT NAME : ");
                student.setName(sc.next());
                
                System.out.println("\n STUDENT ROLL NUMBER : ");
                student.setRollNo(sc.nextInt());
                
                System.out.println("\n STUDENT AGE : ");
                student.setAge(sc.nextInt());
                
                System.out.println("\n STUDENT MARK : ");
                student.setMark(sc.nextInt());
                
                // input student into array
                students.inputStudent(student, i);
            }
            // display all students in array
            students.displayStudents();
        
        } catch (AgeException e) {
            System.out.println("Age must be between 4-18.");
        } catch (RollNoException e) {
            System.out.println("Please enter different roll number, current entry already in the system.");
        } catch (MarksException e) {
            System.out.println("Marks must be between 0-100.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Total number of students cannot be negative.");
        } catch (Exception e) {
            System.out.println("OOPS! Something we wrong, try again in a few minutes.");
        }
        
    }
}
