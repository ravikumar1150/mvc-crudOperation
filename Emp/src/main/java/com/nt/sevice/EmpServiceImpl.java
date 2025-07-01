package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.exception.SalaryNotUpdateException;
import com.nt.repo.EmpRepo;
import org.hibernate.annotations.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

    Logger log = LoggerFactory.getLogger(EmpServiceImpl.class);

    private  final EmpRepo empRepo;

    public EmpServiceImpl(EmpRepo empRepo){

        this.empRepo = empRepo;
    }

    @Override
    public List<EmpDto> findAllEmployee() {

        return empRepo.findAllEmployee();
    }

    @Override
    @Cacheable(value = "employeeByNameCache",key = "#eName")
    public List<EmpDto> getEmployeeByName(String eName) {
        System.out.println("⛏️ Fetching from DB for name: " + eName);
        log.info("getEmployeeByName");
        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        return allEmployee.stream()
                          .filter(f ->f.getEName() !=null &&  f.getEName().equals(eName))
                          .toList();


    }

    @Override
    public Optional<EmpDto> findSecondHighSal(Integer deptNo) {
        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        return allEmployee.stream()
                .filter(emp -> emp.getDept().equals(deptNo))
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .skip(1)
                .findFirst();
    }

    @Override
    public String updateEmpSal(Double salary, String eName) {

        int s = empRepo.empSalUpdateByName(salary, eName);

        if (s > 0) {

            return "success";
        } else {

            throw new SalaryNotUpdateException(eName + empSalNotUpdateException().getMessage());

        }
    }

    public Optional<String> findEmpLocByName(String eName,String job) {

        return empRepo.findEmployeeLoc(eName,job);

    }


    @ExceptionHandler(SalaryNotUpdateException.class)
    public SalaryNotUpdateException empSalNotUpdateException() {

        return new SalaryNotUpdateException(" Salary Not Update");

    }

}


