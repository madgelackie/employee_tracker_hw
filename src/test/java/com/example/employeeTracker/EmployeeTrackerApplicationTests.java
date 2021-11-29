package com.example.employeeTracker;


import com.example.employeeTracker.models.Employee;
import com.example.employeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Kate", 30, "RJWJ884884", "kate@email");
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Frank", 44, "EJ342292929", "frank@email");
		employeeRepository.save(employee2);
	}

}
