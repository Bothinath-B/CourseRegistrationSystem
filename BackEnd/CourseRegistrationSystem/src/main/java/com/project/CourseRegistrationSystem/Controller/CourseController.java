package com.project.CourseRegistrationSystem.Controller;

import com.project.CourseRegistrationSystem.Model.Course;
import com.project.CourseRegistrationSystem.Service.CourseRegistryService;
import com.project.CourseRegistrationSystem.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRegistryService registryService;

    @GetMapping("course/availableCourses")
    public List<Course>availableCourse(){
        return courseService.getCourses();
    }
}