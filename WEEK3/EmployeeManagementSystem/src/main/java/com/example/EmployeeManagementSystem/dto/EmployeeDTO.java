package com.example.EmployeeManagementSystem.dto;
import com.example.EmployeeManagementSystem.entity.Department;
public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Department department;

    public EmployeeDTO(String firstName, String lastName, String email, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
}
