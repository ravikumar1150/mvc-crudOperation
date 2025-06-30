package com.nt.repo;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmpRepo extends JpaRepository<Employee, Integer> {


    @Query("""
    SELECT e.eName, e.department.location
    FROM Employee e
    WHERE e.eName = :ename""")
    Optional<String> findLocationByEmpName(@Param("ename") String ename);

    @Query("SELECT e.empNumber, e.eName,e.job ,e.salary FROM Employee e")
    public List<EmpDto> findAllEmployee();


    @Transactional
    @Modifying
    @Query("update  Employee  e  set e.salary =:salary where e.eName =:eName")
    public int empSalUpdateByName(@Param("salary")Double salary , @Param("eName")String eName);



}

