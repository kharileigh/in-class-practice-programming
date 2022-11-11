/**
 *
 * @author kharileigh
 * <------ STEP 10 : CREATES DAO OBJECT TO TELL GET RETRIEVE/ADD DATA TO DATABASE ------>
 */

package com.kharileigh.studentbeansconfig.service;

import com.kharileigh.studentbeansconfig.entity.Student;
import com.kharileigh.studentbeansconfig.persistence.StudentDao;
import java.util.Collection;


public class StudentServiceImpl implements StudentService {
    
    private StudentDao studentDao;
    
    // ARGS CONSTRUCTOR USING DAO AS ARGUMENT
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    
    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAllRecords();
    }

    // CREATE NEW OBJECT & DAO TO SEARCH
    @Override
    public boolean addStudent(Student student) {
        
        Student newStudent = studentDao.searchRecord(student.getRollNo());
        
        // CHECK IF NEW STUDENT IS IN SYSTEM, YES - DO NOT ADD, NO - ADD
        if(newStudent != null) {
            return false;
        } else {
            studentDao.insertRecord(student);
            return true;
        }
    }

    @Override
    public Student searchByRollNo(int rollNo) {
        return studentDao.searchRecord(rollNo);
    }
    
    
    
}
