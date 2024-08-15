// src/main/java/com/example/EmployeeManagementSystem/repository/EmployeeRepository.java
package com.example.EmployeeManagementSystem.repository;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.dto.EmployeeDTO;
import com.example.EmployeeManagementSystem.dto.DepartmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT new com.example.dto.EmployeeProjectionDTO(e.name, e.position) FROM Employee e")
    List<EmployeeDTO> findEmployeeProjections();
}
