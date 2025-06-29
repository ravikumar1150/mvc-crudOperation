package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import com.nt.exception.SalaryNotUpdateException;
import com.nt.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public List<EmpDto> findAllEmployee() {

        return empRepo.findAllEmployee();
    }

    @Override
    public  List<EmpDto> getEmployeeByName(String empName) {

        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        return allEmployee.stream().filter(f -> f.geteName().equals(empName)).toList();



    }
    @Override
    public Optional<EmpDto> findSecondHighSal(String deptNo) {
        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        Optional<EmpDto> empSecondSal = allEmployee.stream()
                .filter(emp -> emp.getDeptNo().equals(deptNo))        // filter by dept
                .sorted((e1, e2) ->Double.compare(e2.getSalary() , e1.getSalary())) // sort by salary desc
                .skip(1)                                              // skip 1st (highest)
                .findFirst();                                         // get 2nd highest

        return empSecondSal;
    }

    @Override
    public String updateEmpSal(Double salary, String eName) {

        int s = empRepo.empSalUpdateByName(salary, eName);

        if(s>0){

            return "success";
        }else{

            throw  new SalaryNotUpdateException(eName +empSalNotUpdateException().getMessage());
        }


    }


    @ExceptionHandler(SalaryNotUpdateException.class)
    public  SalaryNotUpdateException empSalNotUpdateException(){

        return new SalaryNotUpdateException(" Salary Not Update");

    }

}


