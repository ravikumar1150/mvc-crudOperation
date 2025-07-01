package com.nt.service;

import com.nt.entity.EmpDto;
import com.nt.entity.Employee;
import com.nt.repo.EmpRepo;
import com.nt.sevice.EmpServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmpServiceImplTest {

   private EmpRepo empRepo;

   private EmpServiceImpl empServiceImpl;

   @BeforeEach
   void setUp(){

       empRepo        = mock(EmpRepo.class);
       empServiceImpl = new EmpServiceImpl(empRepo);

   }

   @Test
   void testFindAllEmployee(){

      List<EmpDto> mockList = List.of(new EmpDto(123,"ravi","salesman", 1000),
                                      new EmpDto(124,"nethra","manager", 3000));

      when(empRepo.findAllEmployee()).thenReturn(mockList);

       List<EmpDto> allEmployee = empServiceImpl.findAllEmployee();

       assertEquals(2,allEmployee.size());

   }
    @Test
   public void findEmployeeByName(){

       EmpDto e1 = new EmpDto(123,"ravi","salesman", 1000);

       e1.setEName("ravi");

       List<EmpDto> mockList = List.of(e1, new EmpDto());

       when(empRepo.findAllEmployee()).thenReturn(mockList);

       List<EmpDto> result = empServiceImpl.getEmployeeByName("ravi");

       assertEquals(1,result.size());

   }

}


