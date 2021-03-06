package com.apispring.api_spring.respository;

import com.apispring.api_spring.entity.Account;
import com.apispring.api_spring.entity.Student;
import com.apispring.api_spring.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository   extends JpaRepository<Student, String> {

    Optional<Student> findById(String studentId);


    Student findStudentByAccount_Username(String userName);
}
