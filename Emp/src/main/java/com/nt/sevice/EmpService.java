package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmpService {


    public List<EmpDto> findAllEmployee();


    public  List<EmpDto> getEmployeeByName(String empName);

    public Optional<EmpDto> findSecondHighSal(String deptNo);

    public String updateEmpSal(Double salary,String eName);

    public Optional<String>findEmpLocByName(String eName,String job);

}
