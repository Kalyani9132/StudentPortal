package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Entity.StudentAppEntity;

public interface StudentAppRepository extends JpaRepository<StudentAppEntity, Long> {

}
