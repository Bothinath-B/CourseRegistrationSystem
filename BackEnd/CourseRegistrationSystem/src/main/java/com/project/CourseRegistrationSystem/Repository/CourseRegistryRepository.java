package com.project.CourseRegistrationSystem.Repository;

import com.project.CourseRegistrationSystem.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepository extends JpaRepository<CourseRegistry,Integer> {
}
