package com.ironhack.w4d2.model;

import com.ironhack.w4d2.constraint.OnlyLetters;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class Course {
    @Id
    private String course;
    @Max(value = 400, message = "The course cannot be longer than 400 hours")
    @Min(30)
    private Integer hours;
    @NotEmpty
    //@OnlyLetters
    private String classroom;
    private String vacations;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
