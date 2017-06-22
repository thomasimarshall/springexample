package com.marshall.Dao;

import com.marshall.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomas on 22/06/2017.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
            students = new HashMap<Integer, Student>(){

                {
                    put(1, new Student(1, "Dave", "Maths"));
                    put(2, new Student(2, "Rich", "Physics"));
                    put(3, new Student(3, "Serget", "Russian"));
                }
            };

    }


    public Collection<Student> getAllStudents(){
        return this.students.values();
    };

    public Student getStudentById(int id){
        return this.students.get(id);
    };


}
