package com.example.department.repository;

import com.example.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public class DepartmentRepository extends JpaRepository<Department, Long> {
}
