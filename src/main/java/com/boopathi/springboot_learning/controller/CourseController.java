package com.boopathi.springboot_learning.controller;

import java.util.List;
<<<<<<< HEAD

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.boopathi.springboot_learning.model.Course;
import com.boopathi.springboot_learning.repo.CourseRepository;

=======
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boopathi.springboot_learning.model.Course;
import com.boopathi.springboot_learning.repo.CourseRepository;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:5173") // Allow specific origin
>>>>>>> f5d03ca (CORS Feature  added)
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() {
<<<<<<< HEAD
        return courseRepository.findAll();
    }

=======
        // System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        // System.out.println();
         return courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id){
        return courseRepository.findById(id);

    }


>>>>>>> f5d03ca (CORS Feature  added)
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

<<<<<<< HEAD
=======
    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable Long id){
        courseRepository.deleteById(id);
    }


>>>>>>> f5d03ca (CORS Feature  added)
}
