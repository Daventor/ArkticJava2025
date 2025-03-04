package com.ironhack.w4d2.controller.interfaces;

import com.ironhack.w4d2.controller.dto.CourseClassroomDTO;
import com.ironhack.w4d2.controller.dto.CourseHoursDTO;
import com.ironhack.w4d2.model.Course;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ICourseController {
    List<Course> getAllCourses();
    Course getCourseById(String course);
    List<Course> getCoursesByHoursLessThan(Integer hours);
    List<Course> getCoursesByClassroomAndHours(String classroom, Optional<Integer> hours);

    void saveCourse(Course course);
    void updateCourse(Course course, String id);

    void updateCourseHours(CourseHoursDTO courseHoursDTO, String id);
    void updateCourseClassroom(CourseClassroomDTO courseClassroomDTO, String id);

    void deleteCourse(String id);
}
