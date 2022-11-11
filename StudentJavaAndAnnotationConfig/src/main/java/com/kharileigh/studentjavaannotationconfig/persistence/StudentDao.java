/**
 *
 * @author kharileigh
 * <---- STEP 4 : CREATE DATA TRANSFER OBJECT (interface) ------>
 */

package com.kharileigh.studentjavaannotationconfig.persistence;

import com.kharileigh.studentjavaannotationconfig.entity.Student;
import java.util.Collection;


public interface StudentDao {
    
    // GET ALL STUDENT OBJECTS FROM DATABASE
    Collection<Student> getAllRecords();
   
    // ADD NEW STUDENT OBJECT TO DATABASE
    Student insertRecord(Student student);
    
    // SEARCH STUDENT OBJECT BY ROLLNO
    Student searchRecord(int rollNo);
}
