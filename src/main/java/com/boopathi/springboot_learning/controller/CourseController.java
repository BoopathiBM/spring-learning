package com.boopathi.springboot_learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.boopathi.springboot_learning.model.Course;
import com.boopathi.springboot_learning.repo.CourseRepository;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:5173") // Allow specific origin
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id){
        return courseRepository.findById(id);

    }


    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable Long id){
        courseRepository.deleteById(id);
    }

}
