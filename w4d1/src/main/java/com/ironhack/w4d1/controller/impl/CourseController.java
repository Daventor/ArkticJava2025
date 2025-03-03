package com.ironhack.w4d1.controller.impl;

import com.ironhack.w4d1.controller.interfaces.ICourseController;
import com.ironhack.w4d1.model.Course;
import com.ironhack.w4d1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CourseController implements ICourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{course}")
    public Course getCourseById(@PathVariable(name = "course") String course){
        Optional<Course> courseOptional = courseRepository.findById(course);
        if(courseOptional.isEmpty()) return null;
        return courseOptional.get();
    }

    @GetMapping("/courses/hours")
    public List<Course> getCoursesByHoursLessThan(@RequestParam(name = "hours", defaultValue = "100") Integer hours){
        return courseRepository.findAllByHoursLessThan(hours);
    }

    @GetMapping("/courses/classroom")
    public List<Course> getCoursesByClassroomAndHours(
            @RequestParam(defaultValue = "A1") String classroom,
            @RequestParam Optional<Integer> hours
    ){
        if(hours.isPresent()) return courseRepository.findAllWhereClassroomAndHoursParams(classroom, hours.get());
        return courseRepository.findAllByClassroom(classroom);
    }
}
