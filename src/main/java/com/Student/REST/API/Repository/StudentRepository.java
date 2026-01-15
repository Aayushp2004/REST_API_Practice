package com.Student.REST.API.Repository;

import com.Student.REST.API.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
