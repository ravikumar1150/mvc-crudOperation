package com.nt.entity;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "empno")
    private Integer empNumber;

    @Column(name = "ename")
    private String eName;

<<<<<<< Updated upstream
    @Column(name = "job")
    private String job;

    @Column(name = "sal")
=======
    @Column(name= "job")
    private String job;

    @Column(name="sal")
>>>>>>> Stashed changes
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "deptno")
    private Department department;


}
