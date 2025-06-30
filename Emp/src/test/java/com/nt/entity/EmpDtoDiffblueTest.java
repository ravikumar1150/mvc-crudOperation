package com.nt.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmpDtoDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link EmpDto#EmpDto()}
     *   <li>{@link EmpDto#setDeptNo(String)}
     *   <li>{@link EmpDto#setEmpNumber(Integer)}
     *   <li>{@link EmpDto#setJob(String)}
     *   <li>{@link EmpDto#seteName(String)}
     *   <li>{@link EmpDto#getDeptNo()}
     *   <li>{@link EmpDto#getEmpNumber()}
     *   <li>{@link EmpDto#getJob()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    void testGettersAndSetters() {
        // Arrange and Act
        EmpDto actualEmpDto = new EmpDto();
        actualEmpDto.setDeptNo(Integer.valueOf("Dept No"));
        actualEmpDto.setEmpNumber(10);
        actualEmpDto.setJob("Job");
        actualEmpDto.setEName("E Name");
        String actualDeptNo = String.valueOf(actualEmpDto.getDeptNo());
        Integer actualEmpNumber = actualEmpDto.getEmpNumber();

        // Assert
        assertEquals("Dept No", actualDeptNo);
        assertEquals("Job", actualEmpDto.getJob());
        assertEquals(10, actualEmpNumber.intValue());
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When ten.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link EmpDto#EmpDto(Integer, String, String, String)}
     *   <li>{@link EmpDto#setDeptNo(String)}
     *   <li>{@link EmpDto#setEmpNumber(Integer)}
     *   <li>{@link EmpDto#setJob(String)}
     *   <li>{@link EmpDto#seteName(String)}
     *   <li>{@link EmpDto#getDeptNo()}
     *   <li>{@link EmpDto#getEmpNumber()}
     *   <li>{@link EmpDto#getJob()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when ten")
    @Tag("MaintainedByDiffblue")
    void testGettersAndSetters_whenTen() {
        // Arrange and Act
        EmpDto actualEmpDto = new EmpDto(10, "E Name", "Job", "Dept No",4000,new Department());
        actualEmpDto.setDeptNo(Integer.valueOf("Dept No"));
        actualEmpDto.setEmpNumber(10);
        actualEmpDto.setJob("Job");
        actualEmpDto.setEName("E Name");
        String actualDeptNo = String.valueOf(actualEmpDto.getDeptNo());
        Integer actualEmpNumber = actualEmpDto.getEmpNumber();

        // Assert
        assertEquals("Dept No", actualDeptNo);
        assertEquals("Job", actualEmpDto.getJob());
        assertEquals(10, actualEmpNumber.intValue());
    }

    /**
     * Test {@link EmpDto#getEName()}.
     * <p>
     * Method under test: {@link EmpDto#getEName()}
     */
    @Test
    @DisplayName("Test geteName()")
    @Tag("MaintainedByDiffblue")
    void testGeteName() {
        // Arrange, Act and Assert
        assertNull(new EmpDto().getEName());
    }
}
