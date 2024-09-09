package com.example.my_employee.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "salaries")
@Setter
@Getter
public class SalaryEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = false)
    private EmployeeEntity employee;

    @Column(nullable = false)
    private BigDecimal salary;

    @Column(name = "effective_date", nullable = false)
    private Date effectiveDate;

}
