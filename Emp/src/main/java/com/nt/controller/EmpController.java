package com.nt.controller;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import com.nt.sevice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;


    @GetMapping("/all")
    public ResponseEntity<?> findAllEmp(){

        List<EmpDto> emp = empService.findAllEmployee();

        System.out.println(emp);

      //  List<Employee> collect = emp.stream().collect(Collectors.toList());

        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping("/byname")
    public ResponseEntity<?> findEmpName(@RequestParam  String ename){


        List<EmpDto> employeeByName = empService.getEmployeeByName(ename);

         return  new ResponseEntity<>(employeeByName, HttpStatus.OK);

    }

    @GetMapping("/seconSal/{deptNo}")
    public ResponseEntity<EmpDto> findScondHighSal(@PathVariable String deptNo){

        Optional<EmpDto> secondHighSal = empService.findSecondHighSal(deptNo);

        return ResponseEntity.ok().body(secondHighSal.get());

    }

    @PatchMapping("/salUpdateByName/{salary}/{eName}")
    public ResponseEntity<?> updateEmpSalary(@PathVariable Double salary,
                                             @PathVariable String eName){

        String s = empService.updateEmpSal(salary, eName);

        return new  ResponseEntity<>(s,HttpStatus.OK);


    }

}
