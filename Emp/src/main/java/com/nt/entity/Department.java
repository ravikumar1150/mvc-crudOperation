package com.nt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dept")
public class Department {

    @Id
    @Column(name="deptno")
    private Integer deptNo;

    @Column(name = "dname")
    private  String deptName;

    @Column(name="loc")
    private String location;

    @OneToMany(mappedBy="department")
    private List<Employee> employee;

}
