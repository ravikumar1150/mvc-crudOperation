package com.nt.controller;

import static org.mockito.Mockito.when;

import com.nt.sevice.EmpService;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EmpController.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class EmpControllerDiffblueTest {
    @Autowired
    private EmpController empController;

    @MockBean
    private EmpService empService;

    /**
     * Test {@link EmpController#findAllEmp()}.
     * <p>
     * Method under test: {@link EmpController#findAllEmp()}
     */
    @Test
    @DisplayName("Test findAllEmp()")
    @Tag("MaintainedByDiffblue")
    void testFindAllEmp() throws Exception {
        // Arrange
        when(empService.findAllEmployee()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/all");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(empController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}
