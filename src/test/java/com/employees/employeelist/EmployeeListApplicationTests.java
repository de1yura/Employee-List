package com.employees.employeelist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class EmployeeListApplicationTests {

	@Test
	void itShouldSetAndGetName() {
		Employee employee = new Employee();
		employee.setName("John");
		assertThat(employee.getName()).isEqualTo("John")
				.isNotEqualTo("Jacob");

	}
	@Test
	void itShouldSetAndGetEmail() {
		Employee employee = new Employee();
		employee.setEmail("John@hotmail.com");
		assertThat(employee.getEmail()).isEqualTo("John@hotmail.com")
				.isNotEqualTo("Johnhotmail.com");
	}
	@Test
	void itShouldSetAndGetNumber() {
		Employee employee = new Employee();
		employee.setNumber("12345");
		assertThat(employee.getNumber()).isEqualTo("12345")
				.isNotEqualTo("012345");
	}



}
