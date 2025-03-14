package com.boopathi.springboot_learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boopathi.springboot_learning.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
