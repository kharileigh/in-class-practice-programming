/**
 *
 * @author kharileigh
 * <------ STEP 5 : MAKES CALLS TO DAO TO RETRIEVE & ADD DATA TO DATABASE ------>
 */

package com.kharileigh.studentxmlannotationconfig.service;

import com.kharileigh.studentxmlannotationconfig.entity.Student;
import java.util.Collection;


public interface StudentService {
    
    // COLLECTION OF ALL STUDENTS
    Collection<Student> getAllStudents();
    
    // BOOLEAN TO CHECK IF STUDENT EXISTS BEFORE ADDING NEW STUDENT OBJECT
    boolean addStudent(Student student);
    
    // SEARCH STUDENT OBJECT BY ROLL NO
    Student searchByRollNo(int rollNo);
    
}
