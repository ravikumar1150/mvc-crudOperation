package com.nt.repo;

import com.nt.entity.Department;
import com.nt.entity.DeptDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DeptRepo extends JpaRepository<Department, Integer> {



}
