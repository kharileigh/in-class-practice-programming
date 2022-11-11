/**
 *
 * @author kharileigh
 * <-- STEP 2 & 3 : CREATE & IMPLEMENT BLUEPRINT OF DATABASE ----> 
 */

package com.kharileigh.studentbeansconfig.database;

import com.kharileigh.studentbeansconfig.entity.Student;
import java.util.LinkedHashMap;
import java.util.Map;


public class StudentDatabase {
    
    static private Map<Integer, Student> studentRoster = new LinkedHashMap<Integer, Student>();
    
    static {
    
        studentRoster.put(11, new Student(11, "Josephine", 95));
        studentRoster.put(22, new Student(22, "Khari", 98));
        studentRoster.put(33, new Student(33, "Lorraine", 100));
        studentRoster.put(44, new Student(44, "Mona", 88));
        
    }
    
    //-------- METHOD TO GET ALL STUDENTS IN DATABASE
    public static Map<Integer, Student> getStudentRoster() {
        
        return studentRoster;
    
    }
}
