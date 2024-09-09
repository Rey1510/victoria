package com.example.my_employee.entitiy;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "departments")
@Setter
@Getter
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @JsonProperty("name")
    private String name;

    @OneToOne
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    @JsonProperty("manager")
    private EmployeeEntity manager;

//    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
//    private List<EmployeeEntity> employees;

}
