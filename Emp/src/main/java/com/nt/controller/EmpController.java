package com.nt.controller;

import com.nt.entity.EmpDto;
import com.nt.sevice.EmpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {


    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<EmpDto>> findAllEmp() {

        List<EmpDto> emp = empService.findAllEmployee();

        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping("/findbyname")
    public ResponseEntity<List<EmpDto>> findEmpName(@RequestParam String ename) {
        List<EmpDto> employeeByName = empService.getEmployeeByName(ename);
        return new ResponseEntity<>(employeeByName, HttpStatus.OK);

    }

    @GetMapping("/secondSal/{deptNo}")
    public ResponseEntity<EmpDto> findScondHighSal(@PathVariable String deptNo) {

        Optional<EmpDto> secondHighSal = empService.findSecondHighSal(deptNo);

        return secondHighSal.map(empDto -> new ResponseEntity<>(empDto, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));


    }

    @PatchMapping("/salUpdateByName/{salary}/{eName}")
    public ResponseEntity<String> updateEmpSalary(@PathVariable Double salary,
                                                  @PathVariable String eName) {

        String s = empService.updateEmpSal(salary, eName);

        return new ResponseEntity<>(s, HttpStatus.OK);


    }

    @GetMapping("/locbyname")
    public ResponseEntity<Optional<String>> finEmpLocByName(@RequestParam String eName,@RequestParam String job) {

        Optional<String> empLocByName = empService.findEmpLocByName(eName,job);

        System.out.println(empLocByName);
        return  empLocByName.map(emp -> new ResponseEntity(emp, HttpStatus.OK))
                    .orElseGet(()-> new ResponseEntity(HttpStatus.NOT_FOUND));

    }


}
