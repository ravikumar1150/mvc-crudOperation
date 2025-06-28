package com.nt.entity;

public class EmpDto {

    private Integer empNumber;

    private String eName;

    private String job;

    private String deptNo;

    public EmpDto(Integer empNumber, String eName, String job, String deptNo) {
        this.empNumber = empNumber;
        this.eName = eName;
        this.job = job;
        this.deptNo = deptNo;
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
