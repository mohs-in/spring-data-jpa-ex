package com.spring.data_jpa_ex;

import com.spring.data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByMarksGreaterThan(int marks);
}
