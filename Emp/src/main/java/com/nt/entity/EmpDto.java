package com.nt.entity;

public class EmpDto {

    private Integer empNumber;

    private String eName;

    private String job;

    private String deptNo;

    private Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public EmpDto(Integer empNumber, String eName, String job, String deptNo, Integer salary) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.job = job;
        this.deptNo = deptNo;
        this.salary = salary;
    }


    public EmpDto() {
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }




}
