package com.mission.mission9;

import com.mission.mission9.Model.Employee;
import com.mission.mission9.Model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Mission9Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Mission9Application.class, args);
	}



	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {


//		when scope is unspecified it will default to singleton
//		IoC will create an object and when calling it will refer to same object and will not instantiated new object
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		employee.setName("rahul");
		Employee employee1 = context.getBean(Employee.class);
		System.out.println(employee1);

//		trying prototype scope
//		always re-creating object when instantiated
		Students stu = context.getBean(Students.class);
		System.out.println(stu);
		stu.setFullName("ain");
		stu.getStreet().setStreetName("siera 16");
		System.out.println(stu);
		Students stu1 = context.getBean(Students.class);
		System.out.println(stu1);
	}
}
