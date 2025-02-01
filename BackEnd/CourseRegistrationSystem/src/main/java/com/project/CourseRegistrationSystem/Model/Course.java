package com.project.CourseRegistrationSystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "customCId")
    @SequenceGenerator(name = "customId",initialValue = 901,allocationSize = 1)
    private String courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;
}
