package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void batchInsertEmployees(List<Employee> employees) {
        Session session = entityManager.unwrap(Session.class);
        int batchSize = 50;
        int i = 0;

        for (Employee employee : employees) {
            session.save(employee);
            if (++i % batchSize == 0) {
                // Flush and clear the session
                session.flush();
                session.clear();
            }
        }
        // Handle the remaining entities
        session.flush();
        session.clear();
    }
}

