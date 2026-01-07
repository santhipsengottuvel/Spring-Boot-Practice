package com.springJDBC.demo.Service;

import com.springJDBC.demo.Repository.StudentRepository;
import com.springJDBC.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository repository;

    public void addstudent(Student s) {
        repository.save(s);
    }

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
