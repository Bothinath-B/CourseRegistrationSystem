package com.project.CourseRegistrationSystem.Service;

import com.project.CourseRegistrationSystem.Model.Course;
import com.project.CourseRegistrationSystem.Model.CourseRegistry;
import com.project.CourseRegistrationSystem.Repository.CourseRegistryRepository;
import com.project.CourseRegistrationSystem.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
}
