package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity,Long> {

}
