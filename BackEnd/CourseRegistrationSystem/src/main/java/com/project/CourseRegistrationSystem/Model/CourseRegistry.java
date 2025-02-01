package com.project.CourseRegistrationSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customCRId")
    @SequenceGenerator(name="customCRId",initialValue = 101,allocationSize = 1)
    private int id;
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegistry(String name, String emailId, String courseName) {
     this.name=name;
     this.emailId=emailId;
     this.courseName=courseName;
    }
}