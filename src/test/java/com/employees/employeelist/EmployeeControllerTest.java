package com.employees.employeelist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.verify;

//with this ExtendWith we dont need the commented codes below
@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {

    @InjectMocks
    EmployeeController employeeController;

    @Mock  EmployeeRepository employeeRepository;
    //private AutoCloseable autoCloseable;

//    @BeforeEach
//    void setUp() {
//        autoCloseable = MockitoAnnotations.openMocks(this);
//    }
//
//    @AfterEach
//    void tearDown() throws Exception {
//        autoCloseable.close();
//    }

    @Test
    void canGetAllEmployees() {
        //when
        employeeController.getAllEmployees();
        //then
        verify(employeeRepository).findAll();
    }




    @Test
    @Disabled
    void add() {
    }


    @Test
    @Disabled
    void deleteEmployee() {
    }

    @Test
    @Disabled
    void editEmployee() {
    }
}