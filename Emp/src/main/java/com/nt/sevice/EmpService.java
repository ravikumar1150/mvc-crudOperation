package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;

import java.util.List;

public interface EmpService {


    public List<EmpDto> findAllEmployee();
}
