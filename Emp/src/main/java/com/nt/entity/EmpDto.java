package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto implements Serializable {

    private Integer empNumber;

    private String eName;

    private String job;

    //private Integer deptNo;

    private Integer salary;

    private Integer dept;

    public EmpDto(Integer empNumber, String eName, String job, Integer salary) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.job = job;
        this.salary = salary;
    }

    public EmpDto(Integer empNumber, String eName, String job, Integer salary, Department dept) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.job = job;
        this.salary = salary;
        this.dept = dept.getDeptNo();
    }


}
