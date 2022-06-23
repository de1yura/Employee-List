package com.employees.employeelist.equipment;

import java.util.List;

public interface EquipmentService {
    public Equipment saveEquipment(Equipment equipment);
    public List<Equipment> getAllEquipments();
}
