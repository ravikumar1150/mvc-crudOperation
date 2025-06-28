package com.nt.entity;


import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table(name="emp")
public class Employee {
    @Id
    @Column(name = "empno")
    private Integer empNumber;

    @Column(name = "ename")
    private String eName;



    @Column(name= "job")
    private String job;

    @Column(name="deptno")
    private String deptNo;


    public Employee() {

    }

    public Employee(Integer empNumber, String eName, String job, String deptNo) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.job = job;
        this.deptNo = deptNo;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", deptNo='" + deptNo + '\'' +
                '}';
    }


}
