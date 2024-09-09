package com.example.my_employee.entitiy;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;


import java.time.LocalDate;


@Entity
@Setter
@Getter
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @JsonProperty("last_name")
    private String lastName;

    @Column(name = "hire_date", nullable = false)
    @JsonProperty("hire_date")
    private LocalDate hireDate;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "department_id", referencedColumnName = "id")
//    private DepartmentEntity department;
}
