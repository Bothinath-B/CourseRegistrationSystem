package com.project.CourseRegistrationSystem.Service;

import com.project.CourseRegistrationSystem.Model.CourseRegistry;
import com.project.CourseRegistrationSystem.Repository.CourseRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistryService {
    @Autowired
    private CourseRegistryRepository registryRepository;

    public List<CourseRegistry> getEnrolled(){
        return registryRepository.findAll();
    }

    public void setRegister(String name,String emailId,String courseName){
        CourseRegistry cr=new CourseRegistry(name,emailId,courseName);
        registryRepository.save(cr);
    }
}
