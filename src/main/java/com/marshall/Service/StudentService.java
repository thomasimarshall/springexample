package com.marshall.Service;

import com.marshall.Dao.StudentDao;
import com.marshall.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by thomas on 22/06/2017.
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    };

}
