package com.example.my_employee.service;

import com.example.my_employee.entitiy.EmployeeEntity;
import com.example.my_employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {


    List<EmployeeEntity> getAllEmployees();

  EmployeeEntity getEmployeeById(Long id) ;


  EmployeeEntity saveEmployee(EmployeeEntity employee) ;


    void deleteEmployee(Long id) ;

    EmployeeEntity getEmployeeByFirstName(String firstName);

    Page<EmployeeEntity> getEmployees(Pageable pageable) ;

}
