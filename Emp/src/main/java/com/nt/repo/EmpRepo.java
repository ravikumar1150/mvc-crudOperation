package com.nt.repo;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepo extends JpaRepository<Employee, Integer> {


    @Query("SELECT new com.nt.entity.EmpDto(e.empNumber, e.eName,e.job,e.deptNo) FROM Employee e")
    public List<EmpDto> findAllEmployee();

}

