package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}