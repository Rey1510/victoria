package com.example.my_employee.service.impl;

import com.example.my_employee.entitiy.EmployeeEntity;
import com.example.my_employee.repository.EmployeeRepository;
import com.example.my_employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    // case in-sensitive search
    public EmployeeEntity getEmployeeByFirstName(String firstName) {
        return employeeRepository.findByfirstNameIgnoreCase(firstName).orElse(null);
    }


    @Override
    public Page<EmployeeEntity> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }



}
