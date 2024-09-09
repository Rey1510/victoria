package com.example.my_employee.repository;


import com.example.my_employee.entitiy.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    Optional<EmployeeEntity> findByfirstName(String firstName);

    Optional<EmployeeEntity> findByfirstNameIgnoreCase(String firstName);

    // Find all employees with pagination
    Page<EmployeeEntity> findAll(Pageable pageable);




}
