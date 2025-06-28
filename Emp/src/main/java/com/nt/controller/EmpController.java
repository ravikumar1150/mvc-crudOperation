package com.nt.controller;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import com.nt.sevice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

}
