package com.spring.data_jpa_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.spring.data_jpa_ex.model.Student;

import java.util.Optional;

@SpringBootApplication
public class DataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DataJpaExApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student student1 = context.getBean(Student.class);
		Student student2 = context.getBean(Student.class);
		Student student3 = context.getBean(Student.class);

//		student1.setRollNo(101);
//		student1.setName("Alice");
//		student1.setMarks(48);
//
//		student2.setRollNo(102);
//		student2.setMarks(46);
//		student2.setName("Bob");
//
//		student3.setRollNo(103);
//		student3.setName("Charlie");
//		student3.setMarks(49);
//
//		repo.save(student1);
//		repo.save(student2);
//		repo.save(student3);

		System.out.println(repo.findById(103).orElse(new Student()));
		System.out.println(repo.findByMarksGreaterThan(47));


	}

}
