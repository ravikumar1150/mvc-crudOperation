package com.nt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @Column(name = "empno")
    private Integer empNumber;

    @Column(name = "ename")
    private String eName;

    @Column(name = "job")
    private String job;

    @Column(name="sal")
    private Integer salary;


    @ManyToOne
    @JoinColumn(name = "deptno")
    private Department department;


}
