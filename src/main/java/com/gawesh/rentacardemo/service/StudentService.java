package com.gawesh.rentacardemo.service;

import com.gawesh.rentacardemo.model.Student;


public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}