package com.nt.repo;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpRepo extends JpaRepository<Employee, Integer> {


    @Query("SELECT new com.nt.entity.EmpDto(e.empNumber, e.eName,e.job,e.deptNo,e.salary) FROM Employee e")
    public List<EmpDto> findAllEmployee();
;

    @Transactional
    @Modifying
    @Query("update  Employee  e  set e.salary =:salary where e.eName =:eName")
    public int empSalUpdateByName(@Param("salary")Double salary , @Param("eName")String eName);



}

