package com.ironhack.w4d2.service.impl;

import com.ironhack.w4d2.model.Course;
import com.ironhack.w4d2.repository.CourseRepository;
import com.ironhack.w4d2.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(String course) {
        Optional<Course> courseOptional = courseRepository.findById(course);
        if(courseOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course " + course + " not found");
        return courseOptional.get();
    }

    @Override
    public List<Course> getCoursesByHoursLessThan(Integer hours) {
        return courseRepository.findAllByHoursLessThan(hours);
    }

    @Override
    public List<Course> getCoursesByClassroomAndHours(String classroom, Optional<Integer> hours) {
        if(hours.isPresent()) return courseRepository.findAllWhereClassroomAndHoursParams(classroom, hours.get());
        return courseRepository.findAllByClassroom(classroom);
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course, String id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if(courseOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course " + id + " not found");
        course.setCourse(courseOptional.get().getCourse()); // Protect PK from modifications
        courseRepository.save(course);
    }

    @Override
    public void updateCourseHours(Integer hours, String id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if(courseOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course " + id + " not found");
        Course course = courseOptional.get();
        course.setHours(hours);
        courseRepository.save(course);
    }

    @Override
    public void updateCourseClassroom(String classroom, String id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if(courseOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course " + id + " not found");
        Course course = courseOptional.get();
        course.setClassroom(classroom);
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(String id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        if(courseOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course " + id + " not found");
        courseRepository.deleteById(id);
    }
}
