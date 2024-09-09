package com.example.my_employee.controller;


import com.example.my_employee.entitiy.EmployeeEntity;
import com.example.my_employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
        EmployeeEntity employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employeeDetails) {
        EmployeeEntity employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setHireDate(employeeDetails.getHireDate());
            EmployeeEntity updatedEmployee = employeeService.saveEmployee(employee);
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @GetMapping("/search")
    public ResponseEntity<EmployeeEntity> getEmployeeByFirstName(@RequestParam(name = "first_name") String firstName) {
        EmployeeEntity employee = employeeService.getEmployeeByFirstName(firstName);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Get employees with pagination
    @GetMapping("/page")
    public Page<EmployeeEntity> getAllEmployees(Pageable pageable) {


        return employeeService.getEmployees(pageable);
    }

}
