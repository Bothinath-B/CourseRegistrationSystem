package com.project.CourseRegistrationSystem.Repository;

import com.project.CourseRegistrationSystem.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {

}