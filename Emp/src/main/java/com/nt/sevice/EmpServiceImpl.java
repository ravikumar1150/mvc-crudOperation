package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.exception.SalaryNotUpdateException;
import com.nt.repo.EmpRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

    Logger log = LoggerFactory.getLogger(EmpServiceImpl.class);

    @Autowired
    private EmpRepo empRepo;

    @Override
    public List<EmpDto> findAllEmployee() {

        return empRepo.findAllEmployee();
    }

    @Override
    public List<EmpDto> getEmployeeByName(String empName) {

        log.info("getEmployeeByName");
        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        return allEmployee.stream().filter(f -> f.getEName().equals(empName)).toList();


    }

    @Override
    public Optional<EmpDto> findSecondHighSal(String deptNo) {
        List<EmpDto> allEmployee = empRepo.findAllEmployee();

        return allEmployee.stream()
<<<<<<< Updated upstream
                .filter(emp ->emp.getDeptNo().equals(deptNo))
=======
                .filter(emp -> emp.getDeptNo().equals(deptNo))
>>>>>>> Stashed changes
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

    @Override
<<<<<<< Updated upstream
    public Optional<String> findEmpLocByName(String eName) {

        return empRepo.findLocationByEmpName(eName);
=======
    public Optional<String> findEmpLocByName(String eName,String job) {

        return empRepo.findEmployeeLoc(eName,job);


>>>>>>> Stashed changes

    }


    @ExceptionHandler(SalaryNotUpdateException.class)
    public SalaryNotUpdateException empSalNotUpdateException() {

        return new SalaryNotUpdateException(" Salary Not Update");

    }

}


