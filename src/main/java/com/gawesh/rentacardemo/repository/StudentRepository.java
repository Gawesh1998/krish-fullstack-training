package com.gawesh.rentacardemo.repository;

import com.gawesh.rentacardemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<Student,Integer> {


}
