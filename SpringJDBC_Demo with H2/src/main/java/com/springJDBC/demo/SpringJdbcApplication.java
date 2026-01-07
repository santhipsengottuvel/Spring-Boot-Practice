package com.springJDBC.demo;

import com.springJDBC.demo.Service.StudentService;
import com.springJDBC.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Anisha");
		s.setMarks(100);

		StudentService service = context.getBean(StudentService.class);
		service.addstudent(s);

		List<Student> students = service.getAllStudents();
		System.out.println(students);
	}

}
