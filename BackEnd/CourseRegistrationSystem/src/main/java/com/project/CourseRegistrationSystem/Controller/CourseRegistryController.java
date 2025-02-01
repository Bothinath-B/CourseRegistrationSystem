package com.project.CourseRegistrationSystem.Controller;

import com.project.CourseRegistrationSystem.Model.CourseRegistry;
import com.project.CourseRegistrationSystem.Service.CourseRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CourseRegistryController {
    @Autowired
    private CourseRegistryService courseRegistryService;

    @GetMapping("course/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseRegistryService.getEnrolled();
    }

    @PostMapping("course/register")
    public String registration(@RequestParam(name = "name")String name,
                               @RequestParam(name="emailId")String emailId,
                               @RequestParam(name="courseName")String courseName){
        courseRegistryService.setRegister(name,emailId,courseName);
        return "Thank you! "+"You enrolled for "+courseName+".";
    }


}
