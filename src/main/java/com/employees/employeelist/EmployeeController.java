package com.employees.employeelist;

import com.employees.employeelist.equipment.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;

    @PostMapping("/create")
     ResponseEntity<String> add(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return ResponseEntity.ok("new employee added");
    }

    @GetMapping("/list")
    ResponseEntity <List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteEmployee(@PathVariable int id){
        Employee deleteEmployee = employeeRepository.findById(id).get();
        employeeRepository.delete(deleteEmployee);
        return ResponseEntity.ok("deleted employee " + id);
    }

    @PutMapping("/{id}")
    ResponseEntity<String> editEmployee(@PathVariable int id, @RequestBody Employee employee){
        Employee editEmployee = employeeRepository.findById(id).get();
        editEmployee.setName(employee.getName());
        editEmployee.setDepartment(employee.getDepartment());
        editEmployee.setUser_type(employee.getUser_type());
        editEmployee.setJob_title(employee.getJob_title());
        editEmployee.setEmail(employee.getEmail());
        editEmployee.setNumber(employee.getNumber());
        employeeRepository.save(editEmployee);
        return ResponseEntity.ok("updated employee " + id);
    }
}

