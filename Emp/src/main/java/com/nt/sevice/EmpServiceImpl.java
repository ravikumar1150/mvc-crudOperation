package com.nt.sevice;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import com.nt.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public List<EmpDto> findAllEmployee() {

        return empRepo.findAllEmployee();
    }
}
