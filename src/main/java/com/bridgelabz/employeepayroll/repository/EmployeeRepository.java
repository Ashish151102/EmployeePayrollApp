package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}