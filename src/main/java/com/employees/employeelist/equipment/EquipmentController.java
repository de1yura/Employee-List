package com.employees.employeelist.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/equipment")
@CrossOrigin
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;


    @PostMapping("/create")
    ResponseEntity<String> add(@RequestBody Equipment equipment){
        equipmentRepository.save(equipment);
        return ResponseEntity.ok("new equipment created");
    }

    @GetMapping("/list")
    ResponseEntity <List<Equipment>> getAllEquipments() {
        return ResponseEntity.ok(equipmentRepository.findAll());
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteEquipment(@PathVariable int id){
        Equipment deleteEmployee = equipmentRepository.findById(id).get();
        equipmentRepository.delete(deleteEmployee);
        return ResponseEntity.ok("deleted equipment " + id);
    }

    @PutMapping("/{id}")
    ResponseEntity<String> editEquipment(@PathVariable int id, @RequestBody Equipment equipment){
        Equipment editEmployee = equipmentRepository.findById(id).get();
        editEmployee.setName(equipment.getName());
        equipmentRepository.save(editEmployee);
        return ResponseEntity.ok("updated equipment " + id);
    }


}