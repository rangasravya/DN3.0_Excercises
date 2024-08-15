package com.example.EmployeeManagementSystem.repository;
import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.dto.DepartmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT new com.example.dto.DepartmentProjectionDTO(d.name) FROM Department d")
    List<DepartmentDTO> findDepartmentProjections();
}
