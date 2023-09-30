package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Akash.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
