/**
 *
 * @author kharileigh
 *  * <---- STEP 5 : OVERRIDE METHODS IN DAO INTERFACE ------>

 */

package com.kharileigh.studentjavaannotationconfig.persistence;

import com.kharileigh.studentjavaannotationconfig.database.StudentDatabase;
import com.kharileigh.studentjavaannotationconfig.entity.Student;
import java.util.Collection;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class StudentDaoImpl implements StudentDao {

    //------- calls method in database to get all students
    @Override
    public Collection<Student> getAllRecords() {
        return StudentDatabase.getStudentRoster().values();
    }

    //----- calls method in database to get all students, check if new rollno matches, if not input new student object
    @Override
    public Student insertRecord(Student student) {
        return StudentDatabase.getStudentRoster().put(student.getRollNo(), student);
    }

    //----- calls method in database to get all students, then specifically get student by rollnot
    @Override
    public Student searchRecord(int rollNo) {
        return StudentDatabase.getStudentRoster().get(rollNo);
    }
    
    
    
}
