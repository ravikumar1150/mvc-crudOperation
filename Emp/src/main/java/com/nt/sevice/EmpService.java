package com.nt.sevice;

import com.nt.entity.EmpDto;

import java.util.List;
import java.util.Optional;

public interface EmpService {


    List<EmpDto> findAllEmployee();


    List<EmpDto> getEmployeeByName(String empName);

    Optional<EmpDto> findSecondHighSal(Integer deptNo);

    String updateEmpSal(Double salary,String eName);

    Optional<String>findEmpLocByName(String eName,String job);


}
